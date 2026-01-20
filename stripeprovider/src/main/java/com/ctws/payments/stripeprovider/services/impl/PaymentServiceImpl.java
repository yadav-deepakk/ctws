package com.ctws.payments.stripeprovider.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriBuilder;

import com.ctws.payments.stripeprovider.dtos.PaymentRequest;
import com.ctws.payments.stripeprovider.dtos.StripePaymentResponse;
import com.ctws.payments.stripeprovider.services.impl.helper.CreatePaymentHelper;
import com.ctws.payments.stripeprovider.services.interfaces.PaymentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

  private final CreatePaymentHelper createPaymentHelper;
  private final ModelMapper mapper;
  private final RestClient restClient;

  @Override
  public String getPaymentDetail(String req) {
    log.info("PaymentServiceImpl | getPayment|request: {}", req);
    return "Unimplemented method 'getPayment'";
  }

  @Override
  public String expirePayment(String req) {
    log.info("PaymentServiceImpl | expire|request: {}", req);
    return "Unimplemented method 'expirePayment'";
  }

  @Override
  public StripePaymentResponse createPayment(PaymentRequest req) {
    log.info("PaymentServiceImpl | createPayment|request: {}", req);
    return null;
  }

}
