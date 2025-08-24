package io.ctws.layer_app.config;

import java.util.Random;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

	@Bean
	Random random() {
		return new Random();
	}
	
	@Bean
	@ConditionalOnMissingBean
	Gson gson(GsonBuilder gsonBuilder) {
		return gsonBuilder.create();
	}
}
