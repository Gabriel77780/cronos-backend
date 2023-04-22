package dev.gabrielvasquez.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig {

    private final Environment environment;

    public WebMvcConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry corsRegistry) {
                corsRegistry
                        .addMapping("/api/**")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedOrigins(environment.getProperty("cors.allowed-origins"));
            }
        };
    }

}
