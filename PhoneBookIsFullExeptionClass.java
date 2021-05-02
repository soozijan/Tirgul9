package com.company.Tirgul9;

public class PhoneBookIsFullExeption extends RuntimeException {
    public PhoneBookIsFullExeption() {
    }

    public PhoneBookIsFullExeption(String message) {
        super(message);
    }

    public PhoneBookIsFullExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoneBookIsFullExeption(Throwable cause) {
        super(cause);
    }

    public PhoneBookIsFullExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }



    }

