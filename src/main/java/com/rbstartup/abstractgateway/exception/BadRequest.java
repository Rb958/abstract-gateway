package com.rbstartup.abstractgateway.exception;

public class BadRequest extends AbstractException{

    public BadRequest(BaseExceptionMessage message, String adapterCodePart, String userCodePart) {
        super(message, adapterCodePart, userCodePart);
    }

    public BadRequest(String message, String adapterCodePart, String userCodePart) {
        super(BadRequestEnum.DEFAUL_MESSAGE, adapterCodePart, userCodePart);
        this.message = message;
    }
}
