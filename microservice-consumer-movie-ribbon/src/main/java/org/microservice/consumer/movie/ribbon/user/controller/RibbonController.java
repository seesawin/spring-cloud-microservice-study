package org.microservice.consumer.movie.ribbon.user.controller;

import org.microservice.consumer.movie.ribbon.user.entity.User;
import org.microservice.consumer.movie.ribbon.user.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
  @Autowired
  private RibbonService ribbonService;

  @GetMapping("/ribbon/{id}")
  public String findById(@PathVariable String id) {
    return this.ribbonService.findById(id);
  }
}
