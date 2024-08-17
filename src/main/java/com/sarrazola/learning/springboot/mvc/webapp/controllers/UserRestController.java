package com.sarrazola.learning.springboot.mvc.webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarrazola.learning.springboot.mvc.webapp.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public Map<String, Object> details() {
    User user = new User("Guaripolo", "Arrazola");
    Map<String, Object> responseBody = new HashMap<>();
    responseBody.put("greeting", "Hello World Spring Boot !!!");
    responseBody.put("user", user);
    return responseBody;
  }

// Same result by using Controller + ResponseBody:
// @Controller
// @RequestMapping("/api")
// public class UserRestController {

//   @GetMapping("/details2")
//   @ResponseBody
//   public Map<String, Object> details() {
//     Map<String, Object> responseBody = new HashMap<>();
//     responseBody.put("greeting", "Hello World Spring Boot !!!");
//     responseBody.put("name", "Guaripolo");
//     responseBody.put("lastname", "Arrazola");
//     responseBody.put("title", "Welcome Page");
//     return responseBody;
//   }

}