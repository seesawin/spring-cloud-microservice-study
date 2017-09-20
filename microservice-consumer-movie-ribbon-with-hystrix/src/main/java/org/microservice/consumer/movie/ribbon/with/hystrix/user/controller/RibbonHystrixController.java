package org.microservice.consumer.movie.ribbon.with.hystrix.user.controller;

import org.microservice.consumer.movie.ribbon.with.hystrix.user.entity.User;
import org.microservice.consumer.movie.ribbon.with.hystrix.user.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonHystrixController {
  @Autowired
  private RibbonHystrixService ribbonHystrixService;

  @GetMapping("/ribbon/{id}")
  public String findById(@PathVariable String id) {
    return this.ribbonHystrixService.findById(id);
  }
}
