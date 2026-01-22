package com.ctws.payments.stripeprovider.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class StripeConfig {

  private @Value("${stripe.config.key}") String StripeAPIKey;
  private @Value("${stripe.config.scheme}") String scheme;
  private @Value("${stripe.config.host}") String host;
  private @Value("${stripe.config.api.path}") String path;

}
