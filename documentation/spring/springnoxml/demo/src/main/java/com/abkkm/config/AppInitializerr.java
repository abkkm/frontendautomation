package com.abkkm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializerr extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = { AppConfig.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = { "/mysite.com/*" };
		return arr;
	}

}