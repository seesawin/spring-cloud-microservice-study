package org.microservice.consumer.movie.ribbon.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RibbonService {
  @Autowired
  private RestTemplate restTemplate;

  public String findById(String id) {
    // http://服务提供者的serviceId/url
	System.out.println("RibbonService findById... id is " + id);
    return this.restTemplate.getForObject("http://microservice-provider-user/" + id, String.class);
  }
}
