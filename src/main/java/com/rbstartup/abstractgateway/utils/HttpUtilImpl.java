package com.rbstartup.abstractgateway.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class HttpUtilImpl implements HttpUtil {

    private static final Logger logger;
    private static final ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        logger = LogManager.getLogger(HttpUtilImpl.class);
    }

    public HttpUtilImpl() {
        // Default constructor
    }

    @Override
    public Map<String, Object> sendPOST(String url, Map<String, Object> body, Map<String, String> headers) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headersO = new HttpHeaders();
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                headersO.add(entry.getKey(), entry.getValue());
            }

            HttpEntity<Map<String, Object>> request = new HttpEntity<Map<String, Object>>(body, headersO);

            return mapper.readValue(
                    restTemplate.postForObject(url, request, String.class),
                    new TypeReference<>() {}
            );
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            return new HashMap<>();
        }
    }

    @Override
    public  Map<String, Object> sendPOST(String url, Map<String, Object> body) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<Map<String, Object>> request = new HttpEntity<>(body);
            return mapper.readValue(
                    restTemplate.postForObject(url, request, String.class),
                    new TypeReference<Map<String, Object>>() {}
            );
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            return new HashMap<>();
        }
    }

    @Override
    public  void sendAsyncPost(String url, Map<String, Object> body){
        new Thread(() -> {
            try{
                RestTemplate restTemplate = new RestTemplate();
                HttpEntity<Map<String, Object>> request = new HttpEntity<>(body);
                restTemplate.postForObject(url, request, String.class);
            }catch(Exception e){
                logger.error(e.getMessage(), e);
            }
        }).start();
    }

    @Override
    public  Map<String, Object> sendGET(String url){
        try {
            RestTemplate restTemplate = new RestTemplate();
            return mapper.readValue(
                    restTemplate.getForObject(url, String.class),
                    new TypeReference<Map<String, Object>>() {}
            );
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            return new HashMap<>();
        }
    }

    @Override
    public  Map<String , Object> sendGET(String url, Map<String, String> headers){
        try {
            HttpEntity<Map<String, String>> request = new HttpEntity<>(headers);
            RestTemplate restTemplate = new RestTemplate();
            return mapper.readValue(
                    restTemplate.exchange(url, HttpMethod.GET, request, String.class).getBody(),
                    new TypeReference<Map<String, Object>>() {}
            );
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            return new HashMap<>();
        }
    }
}
