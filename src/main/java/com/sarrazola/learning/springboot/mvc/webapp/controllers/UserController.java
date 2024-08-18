package com.sarrazola.learning.springboot.mvc.webapp.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.sarrazola.learning.springboot.mvc.webapp.models.User;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {

    User user = new User();
    user.setName("Guaripolo");
    user.setLastname("Arrazola");
    user.setEmail("guaripolo@gmail.com");

    model.addAttribute("title", "Welcome Page");
    model.addAttribute("greeting", "Hello World Spring Boot !!!");
    model.addAttribute("user", user);

    return "details";
  }

  @GetMapping("/list")
  public String list(ModelMap model) {

    model.addAttribute("title", "Users List:");

    List<User> users = Arrays.asList(
      new User("Guaripolo", "Arrazola", "guaripoloa@gmail.com"),
      new User("Guachimingo", "Torres"),
      new User("Patana", "Murillo", "patanam@gmail.com"),
    );

    model.addAttribute("users", users);
    
    return "list";
  }

}
