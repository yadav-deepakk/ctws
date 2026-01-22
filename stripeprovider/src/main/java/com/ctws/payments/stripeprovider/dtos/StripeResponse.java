package com.ctws.payments.stripeprovider.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class StripeResponse {
  private String id;
  private String url;
}
