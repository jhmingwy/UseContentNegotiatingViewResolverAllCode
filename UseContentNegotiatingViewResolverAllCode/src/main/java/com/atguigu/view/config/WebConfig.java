package com.atguigu.view.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebConfig implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {  
		// 创建web容器
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // web容器中注册springmvc.xml
        ctx.register(SpringMVCConfig.class);
        // web容器初始化servlet控制器
        ctx.setServletContext(servletContext);
        // web 容器中初始化装载的spring-mvc的核心控制器
        Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        // 设置spring-mvc的映射路径
        dynamic.addMapping("/");
        // 设置spring-mvc的启动加载顺序:0 随web容器启动,大于0,按时顺序随web容器启动一次有小到大启动,小于0首次加载时启动
        dynamic.setLoadOnStartup(1);  
   }  
}