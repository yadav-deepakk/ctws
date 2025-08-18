package io.ctws.layer_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		// list all beans inside the context
		String[] beanNames = ctx.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			log.info("Bean: " + beanName);
		}

	}

}
