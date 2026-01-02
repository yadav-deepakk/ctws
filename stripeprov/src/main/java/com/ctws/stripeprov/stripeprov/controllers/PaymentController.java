package com.ctws.stripeprov.stripeprov.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctws.stripeprov.stripeprov.services.interf.PaymentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/payment")
public class PaymentController {

  private final PaymentService paymentService;

  @GetMapping
  public String getStripePayment() {
    log.info("GET /api/v1/payment || PaymentController|getPayment");
    String paymentResponse = paymentService.getPayment("Payment Request");
    log.info("PaymentService getPaymentDetailResponse: ", paymentResponse);
    return "PaymentDetails";
  }

  @PostMapping
  public String createStripePayment() {
    log.info("POST /api/v1/payment || PaymentController|createStripePayment");
    String createResponse = paymentService.getPayment("Payment Request");
    log.info("PaymentService CreatePaymentResponse: ", createResponse);
    return "PaymentCreated";
  }

  @PostMapping("expire")
  public String expireStripePayment() {
    log.info("POST /api/v1/payment/expire || PaymentController|expireStripePayment");
    String expireResponse = paymentService.getPayment("Payment Request");
    log.info("PaymentService expirePaymentResponse: ", expireResponse);
    return "paymentExpired";
  }

}
