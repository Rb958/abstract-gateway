package com.rbstartup.abstractgateway.exception;

public enum BadRequestEnum implements BaseExceptionMessage{
    DEFAULT_MESSAGE(401, "Bad request");

    private final int httpCode;
    private final String message;

    BadRequestEnum(int httpCode, String message) {
        this.httpCode = httpCode;
        this.message = message;
    }

    @Override
    public int getHttpCode() {
        return httpCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
