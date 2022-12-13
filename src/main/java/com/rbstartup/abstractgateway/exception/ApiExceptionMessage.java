package com.rbstartup.abstractgateway.exception;

public enum ApiExceptionMessage implements BaseExceptionMessage {
    DEFAULT_MESSAGE(701, "APi error");

    private final int httpCode;
    private final String message;

    ApiExceptionMessage(int httpCode, String message) {
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
