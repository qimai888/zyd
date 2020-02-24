package com.qm.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class gmutil {
    public static ResponseEntity<String> httpGet_yundi(String url, String accessToken, String systemType){

        //spring提供访问Rest服务的客户端，包含多种远程访问http的方法
        RestTemplate restTemplate = new RestTemplate();
        //设置返回结果的编码方法
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(java.nio.charset.StandardCharsets.UTF_8));
        //http头部
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("accessToken", accessToken);
        requestHeaders.add("systemType", systemType);
        //HttpEntity
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, requestHeaders);
        //post
        ResponseEntity<String> responseEntity = restTemplate.exchange(url,
                HttpMethod.GET,requestEntity,String.class);
        return responseEntity;
    }
}
