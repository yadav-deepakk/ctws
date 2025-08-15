package com.stripe.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/stripe/webhook")
public class StripeController {

	Logger log = LoggerFactory.getLogger(StripeController.class);

	@PostMapping
	public String webhookHandler(@RequestBody String req) {
		log.info("incoming request : {}" , req);
		return "";
	}

}
