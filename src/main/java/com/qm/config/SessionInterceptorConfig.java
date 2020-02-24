package com.qm.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.qm.filter.AuthorityInterceptor;
/**
 *  会话拦截器配置类
 *
 */
@Configuration
public class SessionInterceptorConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//添加拦截器
		registry.addInterceptor(new AuthorityInterceptor())//自定义拦截器
		.addPathPatterns("/admin.html")//要拦截的显示页面
		.excludePathPatterns("/Error.html");//不拦截的显示页面

		//registry.addInterceptor(new AuthorityInterceptor()).excludePathPatterns("/Test.html");
		
			//.excludePathPatterns("/login.html");//在过滤里剔除不过滤的页面或元素
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
