package com.company.Tirgul9;

public class InvalidNumberExeption extends RuntimeException {
    String string = null;

    public InvalidNumberExeption(String string) {
        this.string = string;
    }

    public InvalidNumberExeption(String message, String string) {
        super(message);
        this.string = string;
    }

    public InvalidNumberExeption(String message, Throwable cause, String string) {
        super(message, cause);
        this.string = string;
    }

    public InvalidNumberExeption(Throwable cause, String string) {
        super(cause);
        this.string = string;
    }

    public InvalidNumberExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String string) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.string = string;
    }
}
