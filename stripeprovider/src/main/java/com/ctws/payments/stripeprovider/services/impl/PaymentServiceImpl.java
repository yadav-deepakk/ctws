package com.ctws.payments.stripeprovider.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.ctws.payments.stripeprovider.configs.StripeConfig;
import com.ctws.payments.stripeprovider.dtos.PaymentRequest;
import com.ctws.payments.stripeprovider.dtos.StripeResponse;
import com.ctws.payments.stripeprovider.services.impl.helper.CreatePaymentHelper;
import com.ctws.payments.stripeprovider.services.interfaces.PaymentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

  private final RestClient restClient;
  private final StripeConfig stripeConfig;
  private final CreatePaymentHelper createPaymentHelper;

  @Override
  public String getPaymentDetail(String providerRef) {
    log.info("PaymentServiceImpl |getPayment |providerRef: {}", providerRef);
    return "Unimplemented method 'getPayment'";
  }

  @Override
  public String expirePayment(String req) {
    log.info("PaymentServiceImpl | expire|request: {}", req);
    return "Unimplemented method 'expirePayment'";
  }

  @Override
  public StripeResponse createPayment(PaymentRequest paymentRequest) {
    log.info("PaymentServiceImpl | createPayment|request: {}", paymentRequest);
    try {
      StripeResponse checkoutSession = createPaymentHelper.createCheckoutSession(paymentRequest);
      return checkoutSession;
    } catch (Exception e) {
      log.error("PaymentServiceImpl | createPayment|error: {}", e.getMessage(), e);
      return null;
    }

  }

}
