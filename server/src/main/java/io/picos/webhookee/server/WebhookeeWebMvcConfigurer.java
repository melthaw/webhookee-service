package io.picos.webhookee.server;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.Filter;

@Configuration
public class WebhookeeWebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Bean
    public FilterRegistrationBean httpMethodFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(httpMethodFilter());
        registration.addUrlPatterns("/*");
        registration.setName("httpMethodFilter");
        registration.setOrder(Ordered.HIGHEST_PRECEDENCE + 1);
        return registration;
    }

    @Bean(name = "httpMethodFilter")
    public Filter httpMethodFilter() {
        return new HttpPutFormContentFilter();
    }

}
