package com.ctws.stripeprov.stripeprov.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "api/v1/hello")
public class HelloWorld {

  @GetMapping(value = "{name}")
  public String greet(@PathVariable String name) {
    log.info("HelloWorld | greet || name:{}", name);
    return "Hello " + name;
  }
}
