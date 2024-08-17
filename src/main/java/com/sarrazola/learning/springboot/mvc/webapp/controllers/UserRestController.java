package com.sarrazola.learning.springboot.mvc.webapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarrazola.learning.springboot.mvc.webapp.models.User;
import com.sarrazola.learning.springboot.mvc.webapp.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public UserDto details() {

    User user = new User();
    user.setName("Guaripolo");
    user.setLastname("Arrazola");

    UserDto userDto = new UserDto();
    userDto.setGreeting("Hello World Spring Boot !!!");
    userDto.setUser(user);

    return userDto;
  }

  @GetMapping("/list")
  public List<User> list() {

    User user1 = new User();
    user1.setName("Guaripolo");
    user1.setLastname("Arrazola");

    User user2 = new User();
    user2.setName("Guachimingo");
    user2.setLastname("Torres");

    User user3 = new User();
    user3.setName("Patana");
    user3.setLastname("Murillo");
    
    List<User> users = Arrays.asList(user1, user2, user3);
    
    return users;
  }

}
