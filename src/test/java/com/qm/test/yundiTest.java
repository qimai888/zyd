package com.qm.test;

import com.alibaba.fastjson.JSONObject;
import com.qm.util.gmservice;
import com.qm.util.gmutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class yundiTest {
    public static void main(String[] args ){

        new yundiTest().yundilogin();
    }
    public  void yundilogin()
    {
        String url = "https://www.yundeeiot.com/base/api/third/ssologin";
//        String url = "https://www.yundeeiot.com/daq/api/index.html#/home";
        String accessToken = "1JBqEAf8sxQcldXDPU8r5Ojh27HdCVJOpmYhcURBXj0mwDI4ACVJlGGLGrpFheDcRm3BtOWSiTf59VHadPdKbU25wN41iCn2rR1as8g9Gkg4zWXxGE1CCVKUNlTIGIXj";
        String systemType = "1";

//        String token = gmservice.login(url,accessToken,systemType);
        ResponseEntity<String> responseEntity = gmutil.httpGet_yundi(url,accessToken,systemType);
        System.out.println("取数");
        System.out.println(responseEntity);

        System.out.println("*****");
        System.out.println(responseEntity.getBody());


        JSONObject jsonObject=JSONObject.parseObject(responseEntity.getBody());



        String jsonCode=jsonObject.getString("code");
        System.out.println("jsonDate为");
        System.out.println(jsonCode);

        if(jsonCode.equals("200"))
        {
            System.out.println("登录成功");

            System.out.println(jsonObject.getJSONObject("data").getString("userId"));
            System.out.println(jsonObject.getJSONArray("data"));
        }
        else
        {
//            gmresult.setToken(token);
            System.out.println("登录失败");
        }
    }
}
