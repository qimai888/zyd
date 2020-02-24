package com.qm.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;



@Service
public class HttpClient {

//    GET
    public String tokenClient(String url, MultiValueMap<String, String> params, HttpHeaders headers){
        RestTemplate clinet=new RestTemplate();

        HttpMethod method=HttpMethod.GET;
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String,String>> requestEntity=new HttpEntity<>(params,headers);
        ResponseEntity<String > response= clinet.exchange(url,method,requestEntity,String.class);

        System.out.println("提交"+response.getStatusCode());
        return response.getBody();
    }

//    public String tokenGet(String url,String accessToken,String systemType){
//
//    }
}
