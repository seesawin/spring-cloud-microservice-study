package org.microservice.consumer.movie.ribbon.with.hystrix.user.service;

import org.microservice.consumer.movie.ribbon.with.hystrix.user.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonHystrixService {
  @Autowired
  private RestTemplate restTemplate;
  private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

  /**
   * 使用@HystrixCommand注解指定当该方法发生异常时调用的方法
   * @param id id
   * @return 通过id查询到的用户
   */
  @HystrixCommand(fallbackMethod = "fallback")
  public String findById(String id) {
	System.out.println("hystrix RibbonService findById... id is " + id);
    return this.restTemplate.getForObject("http://microservice-provider-user/" + id, String.class);
  }

  /**
   * hystrix fallback方法
   * @param id id
   * @return 默认的用户
   */
  public String fallback(String id) {
    RibbonHystrixService.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
    User user = new User();
    user.setId(-1L);
    user.setUsername("default username");
    user.setAge(0);
    return "异常发生，进入fallback方法，接收的参数：id = {}" + id;
  }
}
