package io.ctws.layer_app.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import io.ctws.layer_app.pojo.AdditionRequest;
import io.ctws.layer_app.pojo.AdditionResponse;
import io.ctws.layer_app.services.MyService;

@RestController
@RequestMapping(path = "add")
public class AdditionController {

	Logger log = LoggerFactory.getLogger(AdditionController.class);

	private final MyService service1;
	private final MyService service2;
	private final Random random;
	private final Gson gson;

	public AdditionController(@Qualifier(value = "myServiceObject1") MyService service1,
			@Qualifier(value = "myServiceObject2") MyService service2, Random random, Gson gson) {
		this.service1 = service1;
		this.service2 = service2;
		this.random = random;
		this.gson = gson;
	}

	@PostMapping
	public ResponseEntity<AdditionResponse> additionHandler(@RequestBody AdditionRequest req) {
		String string1 = gson.toJson(req);
		log.info("request in string format: {}", string1);
		long res = (long) req.getValA() + req.getValB();
		return ResponseEntity.ok(new AdditionResponse(res));
	}

	@GetMapping("random")
	public ResponseEntity<String> additionHandler() {
		return ResponseEntity.ok(String.valueOf(random.nextInt(100, 1000)));
	}

	@PostMapping("trying")
	public ResponseEntity<String> trialHandler() {

		log.info(service1.toString());
		log.info(service2.toString());

		return ResponseEntity.ok("TRY...");

	}

}
