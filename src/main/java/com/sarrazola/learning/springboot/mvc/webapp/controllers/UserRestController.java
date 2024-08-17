package com.sarrazola.learning.springboot.mvc.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarrazola.learning.springboot.mvc.webapp.models.User;
import com.sarrazola.learning.springboot.mvc.webapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

  // Using a DTO to handle the response:
  @GetMapping("/details")
  public UserDto details() {
    User user = new User("Guaripolo", "Arrazola");
    UserDto userDto = new UserDto("Hello World Spring Boot !!!", user);
    return userDto;
  }

  // Using Map to handle the response:
  // @GetMapping("/details")
  // public Map<String, Object> details() {
  //   User user = new User("Guaripolo", "Arrazola");
  //   Map<String, Object> responseBody = new HashMap<>();
  //   responseBody.put("greeting", "Hello World Spring Boot !!!");
  //   responseBody.put("user", user);
  //   return responseBody;
  // }

}
