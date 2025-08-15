package io.ctws.layer_app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ctws.layer_app.pojo.AdditionRequest;
import io.ctws.layer_app.pojo.AdditionResponse;

@RestController
@RequestMapping(path = "add")
public class AdditionController {

	Logger log = LoggerFactory.getLogger(AdditionController.class);

	@PostMapping
	public ResponseEntity<AdditionResponse> additionHandler(@RequestBody AdditionRequest req) {
		log.info("incoming req - valA: {}, valB: {}", req.getValA(), req.getValB());
		long res = (long) req.getValA() + req.getValB();
		return ResponseEntity.ok(new AdditionResponse(res));
	}

}
