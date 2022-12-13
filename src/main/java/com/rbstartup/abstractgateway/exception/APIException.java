package com.rbstartup.abstractgateway.exception;

public class APIException extends AbstractException {
    public APIException(BaseExceptionMessage message, String adapterCodePart, String userCodePart) {
        super(message, adapterCodePart, userCodePart);
    }
    public APIException(String message, String adapterCodePart, String userCodePart) {
        super(ApiExceptionMessage.DEFAULT_MESSAGE, adapterCodePart, userCodePart);
        this.message = message;
    }
}
