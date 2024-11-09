package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LivestreamAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivestreamAppApplication.class, args);
	}

	@Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedOrigins("https://3523-171-243-48-1.ngrok-free.app")
                        .allowedHeaders("*");
            }
        };
    }
}
