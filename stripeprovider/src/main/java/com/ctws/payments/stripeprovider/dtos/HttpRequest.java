package com.ctws.payments.stripeprovider.dtos;

import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class HttpRequest {
  private HttpMethod method;
  private String baseUrl;
  private Map<String, String> queryParams;
  private Optional<HttpHeaders> requestHeader;
  private Optional<String> body;
}
