package io.picos.webhookee.rest.filter;

import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpTransitionElasticSearchLoggingFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        final ContentCachingRequestWrapper requestWrapper =
                (request instanceof ContentCachingRequestWrapper)
                        ? (ContentCachingRequestWrapper) request : new ContentCachingRequestWrapper(request);
        final ContentCachingResponseWrapper responseWrapper =
                (response instanceof ContentCachingResponseWrapper)
                        ? (ContentCachingResponseWrapper) response : new ContentCachingResponseWrapper(response);
        try {
            filterChain.doFilter(requestWrapper, responseWrapper);
        } finally {
            if (!isBinaryContent(requestWrapper) && !isMultipart(requestWrapper)) {
//                HttpTransition httpTransition = new HttpTransition();
//                try {
//                    httpTransition.setRequestedAt(new Date());
//                    httpTransition.setMethod(requestWrapper.getMethod());
//                    httpTransition.setUrl(requestWrapper.getRequestURI());
//
//                    Map<String, String> httpHeaders = new HashMap<>();
//                    Collections.list(requestWrapper.getHeaderNames())
//                               .forEach(name -> httpHeaders.put(name, requestWrapper.getHeader(name)));
//                    httpTransition.setHeaders(httpHeaders);
//
//                    String requestBody = new String(requestWrapper.getContentAsByteArray(),
//                                                    requestWrapper.getCharacterEncoding());
//                    httpTransition.setRequestBody(requestBody);
//
//                    httpTransition.setResponseStatus(responseWrapper.getStatus());
//
//                    String responseBody = new String(responseWrapper.getContentAsByteArray(),
//                                                     responseWrapper.getCharacterEncoding());
//                    httpTransition.setResponseBody(responseBody);
//
//                } catch (Throwable e) {
//                } finally {
//                    try {
//                        messageService.auditing(httpTransition);
//                    } catch (Throwable e) {
//
//                    }
//                }
            }
            responseWrapper.copyBodyToResponse();
        }
    }

    private boolean isBinaryContent(final HttpServletRequest request) {
        if (request.getContentType() == null) {
            return false;
        }
        return request.getContentType().startsWith("image") || request.getContentType().startsWith("video") ||
                request.getContentType().startsWith("audio");
    }

    private boolean isMultipart(final HttpServletRequest request) {
        return request.getContentType() != null && request.getContentType().startsWith("multipart/form-data");
    }

}
