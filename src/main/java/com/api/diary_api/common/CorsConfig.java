package com.api.diary_api.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // 해당 경로에 대한 요청
                .allowedOrigins("http://localhost:3000") // 여기서부터 들어오는 요청 허용
                .allowedMethods("GET", "POST") // Get, Post 메서드
                .allowCredentials(true); //쿠키 인증 허용
    }
}
