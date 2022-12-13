package com.rbstartup.abstractgateway.exception;

public enum CustomExceptionEnum implements BaseExceptionMessage{
    DEFAULT_MESSAGE(601, "Custom error");

    private final int httpCode;
    private final String message;

    CustomExceptionEnum(int httpCode, String message) {
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
