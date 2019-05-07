package com.github.awesometesting.resttemplate;

import com.github.awesometesting.resttemplate.model.User;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

class TestClient {

  private RestTemplate restTemplate;

  TestClient(TestClientConfiguration testClientConfiguration) {
    this.restTemplate = new RestTemplate();
    this.restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory(testClientConfiguration.getUrl()));
    this.restTemplate.setMessageConverters(List.of(new MappingJackson2HttpMessageConverter()));
  }

  Users users() {
    return new Users();
  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public class Users {

    List<User> list() {
      return Arrays.asList(Objects.requireNonNull(restTemplate.getForObject("/users", User[].class)));
    }
  }
}
