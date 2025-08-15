package com.stripe.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stripe.example.demo.pojo.AdditionRequest;

@RestController
@RequestMapping("/api/v1")
public class AdditionController {
	
	@PostMapping("add")
	public ResponseEntity<?> addOpertionHandler(@RequestBody AdditionRequest additionReq) {
		return ResponseEntity.ok(additionReq.getValA() + additionReq.getValB()); 
	}

}
