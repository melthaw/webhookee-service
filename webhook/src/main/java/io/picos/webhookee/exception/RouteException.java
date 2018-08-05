package io.picos.webhookee.exception;

/**
 * @auther dz
 */
public class RouteException extends RuntimeException {

    public RouteException() {
    }

    public RouteException(String message) {
        super(message);
    }

    public RouteException(String message, Throwable cause) {
        super(message, cause);
    }

    public RouteException(Throwable cause) {
        super(cause);
    }

    public RouteException(String message, Throwable cause, boolean enableSuppression,
                          boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
