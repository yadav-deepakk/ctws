package com.ctws.payments.stripeprovider.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class PaymentRequest {

  private String mode;
  private String successUrl;
  private String cancelUrl;
  private String currency;
  private Integer ProductQuantity;
  private String productName;
  private Double amount;

}
