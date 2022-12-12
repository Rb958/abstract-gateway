package com.rbstartup.abstractgateway.restcontroller;

public class BaseURI {
    private static final String BASE_URI = "/api/";

    public static final String VERIFY = BASE_URI + "verify";
    public static final String REFERENCE_INFO = BASE_URI + "reference";
    public static final String AMOUNT = BASE_URI + "amount";
    public static final String OPTIONS = BASE_URI + "options";
    public static final String PAYMENT = BASE_URI + "payment";
    public static final String STATUS = BASE_URI + "status";
    public static final String TRANSACTION = BASE_URI + "transaction";
    public static final String REGULATE = BASE_URI + "regulate";
    public static final String CANCEL = BASE_URI + "cancel";

    private BaseURI(){}
}
