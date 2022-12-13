package com.rbstartup.abstractgateway.exception;

public class CustomException extends AbstractException{
    public CustomException(BaseExceptionMessage message, String adapterCodePart, String userCodePart) {
        super(message, adapterCodePart, userCodePart);
    }

    public CustomException(String message, String adapterCodePart, String userCodePart) {
        super(CustomExceptionEnum.DEFAULT_MESSAGE, adapterCodePart, userCodePart);
        this.message = message;
    }
}
