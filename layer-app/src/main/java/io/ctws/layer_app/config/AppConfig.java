package io.ctws.layer_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.ctws.layer_app.services.MyService;

@Configuration
public class AppConfig {

	@Bean("myServiceObject1")
	MyService method1() {
		return new MyService(1, "First Service");
	}

	@Bean("myServiceObject2")
	MyService method2() {
		return new MyService(2, "Second Service");
	}
}
