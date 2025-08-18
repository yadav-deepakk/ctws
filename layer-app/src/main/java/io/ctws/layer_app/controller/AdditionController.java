package io.ctws.layer_app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ctws.layer_app.pojo.AdditionRequest;
import io.ctws.layer_app.pojo.AdditionResponse;
import io.ctws.layer_app.services.MyService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "add")
public class AdditionController {

	Logger log = LoggerFactory.getLogger(AdditionController.class);

	private final MyService service1;
	private final MyService service2;

	public AdditionController(@Qualifier(value = "myServiceObject1") MyService service1,
			@Qualifier(value = "myServiceObject2") MyService service2) {
		this.service1 = service1;
		this.service2 = service2;
	}

	@PostMapping
	public ResponseEntity<AdditionResponse> additionHandler(@RequestBody AdditionRequest req) {
		log.info("incoming req - valA: {}, valB: {}", req.getValA(), req.getValB());
		long res = (long) req.getValA() + req.getValB();
		return ResponseEntity.ok(new AdditionResponse(res));
	}

	@PostMapping("/trying")
	public ResponseEntity<String> trialHandler() {

		log.info(service1.toString());
		log.info(service2.toString());

		return ResponseEntity.ok("TRY...");

	}

}
