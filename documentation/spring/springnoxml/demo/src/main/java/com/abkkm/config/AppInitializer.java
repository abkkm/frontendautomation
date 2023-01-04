package com.abkkm.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

//if we use a class AppInitializerr with AbstractAnnotationConfigDispatcherServletInitializer this class no need
public class AppInitializer { //implements WebApplicationInitializer {

	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("hello");
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext(); 
		webApplicationContext.register(AppConfig.class);
		
		//create a dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		//register dispatcher servlet with servlet context
		ServletRegistration. Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/mysite.com/*");
		
		
	}

}