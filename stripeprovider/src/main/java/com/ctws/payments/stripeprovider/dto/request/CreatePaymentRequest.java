package com.ctws.payments.stripeprovider.dto.request;

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
public class CreatePaymentRequest {
  private String field1;
  private String field2;
  private String field3;
  private String field4;
}
