package com.ctws.payments.stripeprovider.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  void shouldAddTwoNums() {
    Calculator cal = new Calculator(); 
    long result = cal.addTwoNumber(5, 6); 
    assertEquals(11, result); 
  }
  
  
}
