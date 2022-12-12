package com.rbstartup.abstractgateway.utils;

import java.util.Map;

public interface HttpUtil {

//    boolean isOk(Map<String, Object> response);

    Map<String, Object> sendPOST(String url, Map<String, Object> body, Map<String, String> headers);

    Map<String, Object> sendPOST(String url, Map<String, Object> body);

    void sendAsyncPost(String url, Map<String, Object> body);

    Map<String, Object> sendGET(String url);

    Map<String , Object> sendGET(String url, Map<String, String> headers);
}
