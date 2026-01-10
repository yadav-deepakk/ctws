package com.ctws.payments.stripeprovider.configs;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;

@Getter
public class StripeConfig {

  private @Value("${stripe.config.api.key") String StripeAPIKey;
  private @Value("${stripes.config.scheme}") String scheme;
  private @Value("${stripe.config.host}") String host;
  private @Value("${stripe.config.path.create-session}") String pathCreateSession;
  private @Value("${stripe.config.path.get-session}") String pathGetSesssion;
  private @Value("${stripe.config.path.expire-session}") String pathExpireSession;

}
