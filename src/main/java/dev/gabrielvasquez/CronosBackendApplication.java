package dev.gabrielvasquez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CronosBackendApplication {

	public CronosBackendApplication(Environment environment) {
		this.environment = environment;
	}

	public static void main(String[] args) {
		SpringApplication.run(CronosBackendApplication.class, args);
	}

	private final Environment environment;

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
