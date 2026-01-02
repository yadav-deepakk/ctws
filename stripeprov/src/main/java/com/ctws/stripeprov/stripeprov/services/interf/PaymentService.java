package com.ctws.stripeprov.stripeprov.services.interf;

public interface PaymentService {

  String createPayment(String req);

  String getPayment(String req);

  String expirePayment(String req);
}
