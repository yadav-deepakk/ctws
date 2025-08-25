package io.ctws.layer_app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SpringProfilesConfig {

	@Value("${env.tempvar}")
	private String tempEnvVar;

	@Value("${env.envvar}")
	private String envVar;

	@PostConstruct
	public void init() {
		log.info("env-var: {}, temp-env-var: {}", envVar, tempEnvVar);
	}
}
