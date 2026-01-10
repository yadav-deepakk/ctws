package com.ctws.payments.stripeprovider.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class PaymentRequest {
  private String field1;
  private String field2;
  private String field3;
  private String field4;
}
