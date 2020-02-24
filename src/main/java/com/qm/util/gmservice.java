package com.qm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class gmservice {
    public static String login(String url, String accessToken, String systemType){
        String token=null;
        ResponseEntity<String> responseEntity=gmutil.httpGet_yundi(url, accessToken,systemType);
        System.out.println(responseEntity);

        return token;
    }
}
