package com.ctws.payments.stripeprovider.http;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor
public class HttpService {

  private final RestClient restClient;

  public String makeHttpCall(ApiRequest request) {

    try {

      UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance()
          .scheme(request.getScheme())
          .host(request.getHost());

      if (request.getPort().isPresent())
        uriBuilder.port(request.getPort().get());

      if (request.getPath().isPresent())
        uriBuilder.path(request.getPath().get());

      if (request.getQueryParams().isPresent()) {
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
        request.getQueryParams().get().forEach(multiValueMap::add);
        uriBuilder.queryParams(multiValueMap);
      }

      uriBuilder.build(true);

      return restClient
          .method(request.getMethod())
          .uri(uriBuilder.toUriString())
          .headers(h -> h.addAll(request.getHeaders()))
          .body(request.getBody().isPresent() ? request.getBody() : "")
          .retrieve()
          .body(String.class);

    } catch (Exception e) {
      log.info("HttpService | makeHttpCall|exception: {}", e.getMessage(), e);
      return null;
    }

  }

}
