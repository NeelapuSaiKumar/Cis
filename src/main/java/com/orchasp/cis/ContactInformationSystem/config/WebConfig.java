//package com.orchasp.cis.ContactInformationSystem.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
////	@Value("${file.upload-dir}")
////	private String uploadFile;
////	@Override
////	public void addResourceHandlers(ResourceHandlerRegistry registry) {
////		registry.addResourceHandler("/files/get/**")
////		.addResourceLocations("file:"+uploadFile+"/");
////	}
//
//	    @Override
//	    public void addCorsMappings(CorsRegistry registry) {
//	        registry.addMapping("/**")
//	                .allowedOrigins("http://localhost:4200") // Adjust as necessary
//	                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//	                .allowedHeaders("*");
//	    }
//	}