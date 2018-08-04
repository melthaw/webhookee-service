package io.picos.webhookee.config.exception;

/**
 * @auther dz
 */
public class RouteEntityNotFoundException extends RuntimeException {

    public RouteEntityNotFoundException() {
    }

    public RouteEntityNotFoundException(String message) {
        super(message);
    }

    public RouteEntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RouteEntityNotFoundException(Throwable cause) {
        super(cause);
    }

    public RouteEntityNotFoundException(String message, Throwable cause, boolean enableSuppression,
                                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
