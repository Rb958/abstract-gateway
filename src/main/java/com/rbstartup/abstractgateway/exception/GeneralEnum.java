package com.rbstartup.abstractgateway.exception;

public enum GeneralEnum implements BaseExceptionMessage{
    GENERAL_FAILURE(501, "General failure");

    private final int httpCode;
    private final String message;

    private GeneralEnum(int httpCode, String message){
        this.message = message;
        this.httpCode = httpCode;
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
