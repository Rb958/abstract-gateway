package com.rbstartup.abstractgateway.exception;

public interface BaseExceptionMessage {
    int getHttpCode();
    String getMessage();
}
