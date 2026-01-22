package com.ctws.payments.stripeprovider.services.impl.helper;

import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.ctws.payments.stripeprovider.configs.StripeConfig;
import com.ctws.payments.stripeprovider.dtos.PaymentRequest;
import com.ctws.payments.stripeprovider.dtos.StripeResponse;
import com.ctws.payments.stripeprovider.http.ApiRequest;
import com.ctws.payments.stripeprovider.http.HttpService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import tools.jackson.databind.ObjectMapper;

@Slf4j
@Component
@RequiredArgsConstructor
public class CreatePaymentHelper {

  private final ObjectMapper objMapper;
  private final StripeConfig stripeConfig;
  private final HttpService httpService;

  public StripeResponse createCheckoutSession(PaymentRequest paymentRequest) {

    // header
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    headers.setBasicAuth(stripeConfig.getStripeAPIKey(), "");

    // form body
    MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
    formData.add("mode", "payment");
    formData.add("cancel_url", "https://example.com/cancel");
    formData.add("success_url", "https://example.com/success");
    formData.add("line_items[0][quantity]", "2");
    formData.add("line_items[0][price_data][unit_amount]", "100");
    formData.add("line_items[0][price_data][currency]", "EUR");
    formData.add("line_items[0][price_data][product_data][name]", "candy");

    ApiRequest request = ApiRequest.builder()
        .method(HttpMethod.POST)
        .scheme(stripeConfig.getScheme())
        .host(stripeConfig.getHost())
        .build();

    if (stripeConfig.getPath() != null)
      request.setPath(Optional.of(stripeConfig.getPath()));

    request.setPath(Optional.of(stripeConfig.getPath()));

    String response = httpService.makeHttpCall(request);
    log.info("stripeReponse: {}", response);

    StripeResponse stripeResponse = objMapper.readValue(response, StripeResponse.class);

    return stripeResponse;
  }

}
