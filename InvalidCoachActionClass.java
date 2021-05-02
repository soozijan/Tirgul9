package com.company.Tirgul9;

public class InvalidCoachAction extends RuntimeException {
    public InvalidCoachAction() {
    }

    public InvalidCoachAction(String message) {
        super(message);
    }

    public InvalidCoachAction(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCoachAction(Throwable cause) {
        super(cause);
    }

    public InvalidCoachAction(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
