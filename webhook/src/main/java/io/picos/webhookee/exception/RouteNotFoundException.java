package io.picos.webhookee.exception;

/**
 * @auther dz
 */
public class RouteNotFoundException extends RouteException {

    public RouteNotFoundException() {
    }

    public RouteNotFoundException(String message) {
        super(message);
    }

    public RouteNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RouteNotFoundException(Throwable cause) {
        super(cause);
    }

    public RouteNotFoundException(String message, Throwable cause, boolean enableSuppression,
                                  boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
