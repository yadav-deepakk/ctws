package com.ctws.payments.stripeprovider.http;

import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpMethod;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class HttpReq {

  private HttpMethod method;
  private String scheme;
  private String host;
  private Optional<Integer> port;
  private Optional<String> path;
  private Optional<Map<String, String>> queryParams;
  private Optional<Map<String, String>> headers;
  private Optional<Object> body;

}
