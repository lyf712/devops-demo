package com.lyf.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyunfei
 */
@RestController
public class HelloWorldResource {
   @GetMapping("/hello")
   String hello(){return "hello";}
}
