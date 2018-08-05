package io.picos.webhookee.exception;

/**
 * @auther dz
 */
public class RouteConflictException extends RouteException {

    public RouteConflictException() {
    }

    public RouteConflictException(String message) {
        super(message);
    }

    public RouteConflictException(String message, Throwable cause) {
        super(message, cause);
    }

    public RouteConflictException(Throwable cause) {
        super(cause);
    }

    public RouteConflictException(String message, Throwable cause, boolean enableSuppression,
                                  boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
