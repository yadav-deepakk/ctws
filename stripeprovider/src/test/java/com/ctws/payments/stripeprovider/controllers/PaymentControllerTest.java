package com.ctws.payments.stripeprovider.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.ctws.payments.stripeprovider.services.interfaces.PaymentService;

@WebMvcTest(PaymentController.class)
public class PaymentControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockitoBean
  private PaymentService paymentService;

  void shouldReturnPaymentResponse() {
  }

}
