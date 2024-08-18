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

    User user1 = new User();
    user1.setName("Guaripolo");
    user1.setLastname("Arrazola");
    user1.setEmail("guaripoloa@gmail.com");

    User user2 = new User();
    user2.setName("Guachimingo");
    user2.setLastname("Torres");

    User user3 = new User();
    user3.setName("Patana");
    user3.setLastname("Murillo");
    user3.setEmail("patanam@gmail.com");

    // Uncomment to validate when users is empty.
    // List<User> users = new ArrayList<>();
    // Comment to validate when users contains elements.
    List<User> users = Arrays.asList(user1, user2, user3);

    model.addAttribute("users", users);
    
    return "list";
  }

}
