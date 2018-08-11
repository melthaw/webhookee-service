package io.picos.webhookee.exception;

/**
 * @auther dz
 */
public class RouteDisabledException extends RouteException {

    public RouteDisabledException() {
    }

    public RouteDisabledException(String message) {
        super(message);
    }

    public RouteDisabledException(String message, Throwable cause) {
        super(message, cause);
    }

    public RouteDisabledException(Throwable cause) {
        super(cause);
    }

    public RouteDisabledException(String message, Throwable cause, boolean enableSuppression,
                                  boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
