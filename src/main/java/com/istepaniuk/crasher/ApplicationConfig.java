package com.istepaniuk.crasher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public CrashService crashService() {
        return new CrashService();
    }
}
