package com.ctws.stripeprov.stripeprov.services.impl;

import org.springframework.stereotype.Service;

import com.ctws.stripeprov.stripeprov.services.interf.PaymentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {

  @Override
  public String createPayment(String req) {
    log.info("PaymentServiceImpl | createPayment|request:{}", req);
    return "Unimplemented method 'createPayment'";
  }

  @Override
  public String getPayment(String req) {
    log.info("PaymentServiceImpl | getPayment|request:{}", req);
    return "Unimplemented method 'getPayment'";
  }

  @Override
  public String expirePayment(String req) {
    log.info("PaymentServiceImpl | expire|request:{}", req);
    return "Unimplemented method 'expirePayment'";
  }

}
