package com.fse.pm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProjectmanagerApiApplication {
	
//	@Bean
//	public WebMvcConfigurer configure() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				// TODO Auto-generated method stub
//				WebMvcConfigurer.super.addCorsMappings(registry);
//				registry.addMapping("/*").allowedOrigins("*");
//			}
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectmanagerApiApplication.class, args);
	}

}
