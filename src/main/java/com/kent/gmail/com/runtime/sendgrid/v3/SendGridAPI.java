package com.kent.gmail.com.runtime.sendgrid.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.kent.gmail.com.runtime.sendgrid.v3.request.POSTMailSendRequestBody;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;

public class SendGridAPI {

  private static final String DEFAULT_BASE_PATH = "http://api.sendgrid.com/v3";
  private static final Logger logger = LoggerFactory.getLogger(SendGridAPI.class);

  private static final ObjectMapper objectMapper =
      new ObjectMapper()
          .setSerializationInclusion(JsonInclude.Include.NON_NULL)
          .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
          .registerModule(new JavaTimeModule());

  private String basePath = DEFAULT_BASE_PATH;
  private final RestTemplate restTemplate;

  private String token;

  public SendGridAPI() {
    this.restTemplate = getRestTemplate();
  }

  public <T extends SendGridAPI> T setBasePath(String basePath) {
    this.basePath = basePath;
    restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory(basePath));
    return (T) this;
  }

  private RestTemplate getRestTemplate() {
    return new RestTemplateBuilder()
        .uriTemplateHandler(new DefaultUriBuilderFactory(DEFAULT_BASE_PATH))
        .additionalMessageConverters(
            new MappingJackson2HttpMessageConverter(objectMapper), new FormHttpMessageConverter())
        .additionalInterceptors(this::tokenInterceptor)
        .build();
  }

  private ClientHttpResponse tokenInterceptor(
      HttpRequest httpRequest, byte[] bytes, ClientHttpRequestExecution clientHttpRequestExecution)
      throws IOException {
    if (this.token != null) {
      httpRequest.getHeaders().add("Authorization", token);
    }
    return clientHttpRequestExecution.execute(httpRequest, bytes);
  }

  public String getToken() {
    return this.token;
  }

  public <T extends SendGridAPI> T setToken(String token) {
    this.token = token;
    return (T) this;
  }

  public ResponseEntity<Void> pOST_mailsend(POSTMailSendRequestBody pOSTMailSendRequestBody) {
    Map<String, Object> uriParameters = new HashMap<>();
    HttpHeaders headers = new HttpHeaders();
    HttpMethod httpMethod = HttpMethod.POST;
    String path = "/mail/send";

    headers.setContentType(MediaType.valueOf("application/json"));

    final UriComponentsBuilder builder =
        UriComponentsBuilder.fromHttpUrl(basePath).path(path).uriVariables(uriParameters);

    HttpEntity<POSTMailSendRequestBody> entity = new HttpEntity<>(pOSTMailSendRequestBody, headers);

    ParameterizedTypeReference<Void> parameterizedTypeReference =
        new ParameterizedTypeReference<>() {};
    return restTemplate.exchange(
        builder.toUriString(), httpMethod, entity, parameterizedTypeReference);
  }
}
