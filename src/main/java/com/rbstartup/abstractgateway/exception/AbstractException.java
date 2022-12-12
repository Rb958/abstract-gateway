package com.rbstartup.abstractgateway.exception;

public class AbstractException extends RuntimeException{
    protected final String code;
    protected String message;
    protected final String adapterCodePart;
    protected final String userCodePart;
    protected final int httpCode;

    public AbstractException(BaseExceptionMessage message, String adapterCodePart, String userCodePart){
        this.message = message.getMessage();
        this.adapterCodePart = adapterCodePart;
        this.userCodePart = userCodePart;
        this.httpCode = message.getHttpCode();
        this.code = httpCode + "".concat(adapterCodePart).concat(userCodePart);
    }
}
