package com.ctws.payments.stripeprovider.services.interfaces;

public interface PaymentService {

  String createPayment(String req);

  String getPaymentDetail(String req);

  String expirePayment(String req);
}
