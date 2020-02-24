package com.qm.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qm.service.HttpClient;
import com.qm.util.gmservice;
import com.qm.util.gmutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.qm.entity.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 拦截器
 *查看会话内是否有用户Session对象
 *  请求获取session对象去拿里面参数返回一个用户对象；
 */
@Component

public class AuthorityInterceptor extends HandlerInterceptorAdapter {

	/**
	 * 重写拦截的Handle核心方法，返回true表示放行，false拦截；
	 * 前置拦截
	 */
	@Autowired
	HttpClient httpClient;
	gmservice gmservice;
	@Override

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/*System.out.println("进入拦截器1");
		User staff = (User)request.getSession().getAttribute("staff");
		if(null == staff){
			System.out.println("拿不到会话对象，当前为游客对象，跳转去login登录页");
			response.sendRedirect(request.getContextPath()+"/Error.html");
			return false;
		}
		return true;*/
		if(!(handler instanceof HandlerMethod)){
			System.out.println("进入到if");



			Map<String,String[] > parameterMap=request.getParameterMap();
			Map<String,String> paramsMap=  new HashMap<>();
			MultiValueMap<String,String> multiValueMap=new LinkedMultiValueMap<>();

			for (Map.Entry<String,String[]>entry:parameterMap.entrySet()){
				System.out.println(entry.getKey());
				for(String string:entry.getValue()){
					System.out.println(string);
					multiValueMap.put(entry.getKey(), Collections.singletonList(string));

				}
				System.out.println("-----------------");
				System.out.println(parameterMap);
			}
			System.out.println("============");
			System.out.println(paramsMap);

			System.out.println(request);
			HttpServletRequest request1=(HttpServletRequest)request;
			String accessToken=request1.getParameter("accessToken");
			String systemType=request1.getParameter("systemType");
			System.out.println("$$$$$$$$");
			System.out.println(accessToken);
			System.out.println(systemType);
			if (null==accessToken){
				System.out.println("进入到request1是否为空判断");
				return false;
			}else {
				System.out.println("进入else");

				HttpHeaders headers=new HttpHeaders();
//				headers.add("token","密文");
				System.out.println("判断是否为空"+headers);
				String  url="https://www.yundeeiot.com/base/api/third/ssologin";
				System.out.println(multiValueMap);
				String token = gmservice.login(url,accessToken,systemType);
				System.out.println("===============");
				ResponseEntity<String> responseEntity = gmutil.httpGet_yundi(url,accessToken,systemType);
				if(token == null || token.equals(""))
				{
					System.out.println("登录失败");
				}
				else
				{
					//gmresult.setToken(token);
					System.out.println("登录成功");
				}
				/*try {

					httpClient.tokenClient(url,multiValueMap,headers);
				} catch (Exception e) {
					e.printStackTrace();
				}*/

				return true;
			}
		}
		HandlerMethod method=(HandlerMethod) handler;
		System.out.println("这个method的值为"+method.getMethod().getName());
		System.out.println("进入到233");
		return false;
	}
	
}
