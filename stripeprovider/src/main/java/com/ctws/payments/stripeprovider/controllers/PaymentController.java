package com.ctws.payments.stripeprovider.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctws.payments.stripeprovider.dtos.PaymentRequest;
import com.ctws.payments.stripeprovider.dtos.PaymentResponse;
import com.ctws.payments.stripeprovider.dtos.StripeResponse;
import com.ctws.payments.stripeprovider.services.interfaces.PaymentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/payments")
public class PaymentController {

  private final PaymentService paymentService;
  private final ModelMapper mapper;

  @PostMapping
  public PaymentResponse createStripePayment(@RequestBody PaymentRequest request) {
    log.info("POST /api/v1/payment || PaymentController|createStripePayment: {}", request.toString());
    // StripeResponse response = paymentService.createPayment(request);
    // PaymentResponse res = mapper.map(response, PaymentResponse.class);
    // log.info("PaymentService PaymentResponse: {}", res);
    PaymentResponse paymentResponse = PaymentResponse.builder().id("dummy-id").url("http://dummy-url.in/api").build();
    return paymentResponse;
  }

  @GetMapping
  public String getStripePayment(@RequestParam("ref") String providerRef) {
    log.info("GET /api/v1/payment || PaymentController|getPayment: {}", providerRef);
    String paymentDetail = paymentService.getPaymentDetail(providerRef);
    log.info("PaymentService getPaymentDetailResponse: {}", paymentDetail);
    return "PaymentDetails of txn: " + providerRef;
  }

  @PostMapping("expire")
  public String expireStripePayment(@RequestParam("ref") String providerRef) {
    log.info("POST /api/v1/payment/expire || PaymentController|expireStripePayment: {}", providerRef);
    String expireResponse = paymentService.expirePayment("expire payment reponse");
    log.info("PaymentService expirePaymentResponse: {}", expireResponse);
    return "paymentExpired ref: " + providerRef;
  }

}
