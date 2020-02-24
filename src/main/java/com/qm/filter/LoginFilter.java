package com.qm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qm.entity.User;



@WebFilter("/**")
public class LoginFilter implements Filter{
	private static String unFilterUrl;
	private static String skipUrl;
	 
	public void init(FilterConfig fConfig) throws ServletException {
		/*ServletContext context = fConfig.getServletContext();
    	//获取配置文件的参数
    	unFilterUrl = "http://127.0.0.1:8089/admin/login.html";
    	skipUrl= context.getInitParameter("http://127.0.0.1:8089/admin/login.html");*/
		System.out.println("23333");
	}
	    
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request; 
		HttpServletResponse resp = (HttpServletResponse)response;
		//请求的地址
		String requestUrl = req.getRequestURI();
		//System.out.println(requestUrl);
		//不需要过滤的地址
		String strings = unFilterUrl;
			if(strings.equals(requestUrl)){
				chain.doFilter(request, response);
				return;
			}
		
		//获取会话对象中的用户
		User staff  = (User)req.getSession().getAttribute("staff");
		//如果用户已登录
		if(staff!=null && !staff.getAccessToken().isEmpty()){
			chain.doFilter(request, response);
		}else{
			resp.sendRedirect(skipUrl);
		}
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	

	

}
