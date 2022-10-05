package com.farhana;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.farhana"})
public class Config {
	
	
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		
		InternalResourceViewResolver vresolver = new InternalResourceViewResolver();
		
		vresolver.setPrefix("/WEB-INF/");
		vresolver.setSuffix(".jsp");
		return vresolver;
		
	}

}
