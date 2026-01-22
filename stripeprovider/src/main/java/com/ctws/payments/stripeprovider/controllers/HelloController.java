package com.ctws.payments.stripeprovider.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("hello")
public class HelloController {

  @GetMapping
  public String sayHello(@RequestParam(required = false) String name) {
    return "Hello fname: " + name;
  }

}
