package com.ctws.payments.stripeprovider.services.impl.helper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.ctws.payments.stripeprovider.dtos.PaymentRequest;
import com.ctws.payments.stripeprovider.dtos.StripePaymentRequest;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CreatePaymentHelper {

  private final ModelMapper mapper;

  public StripePaymentRequest requestFormation(PaymentRequest request) {
    StripePaymentRequest req = mapper.map(request, StripePaymentRequest.class);
    return req;
  }

}
