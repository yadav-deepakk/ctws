package com.ctws.payments.stripeprovider.services.interfaces;

import com.ctws.payments.stripeprovider.dtos.PaymentRequest;
import com.ctws.payments.stripeprovider.dtos.StripeResponse;

public interface PaymentService {

  StripeResponse createPayment(PaymentRequest req);

  String getPaymentDetail(String req);

  String expirePayment(String req);
}
