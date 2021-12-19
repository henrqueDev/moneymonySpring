package br.edu.ifpb.luis.freire.moneymony;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class AppConfig {
	 @Bean public WebMvcConfigurer corsConfigurer() {
	       return new WebMvcConfigurer() {
	           @Override public void addCorsMappings(CorsRegistry registry) {
	               registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE");
	           }
	       };
	   }
	

}