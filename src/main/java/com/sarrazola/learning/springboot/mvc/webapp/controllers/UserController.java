package com.sarrazola.learning.springboot.mvc.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  // Using Model:
  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "Welcome Page");
    model.addAttribute("greeting", "Hello World Spring Boot !!!");
    model.addAttribute("name", "Guaripolo");
    model.addAttribute("lastname", "Arrazola");
    return "details";
  }

  // Using Map:
  // @GetMapping("/details")
  // public String details(Map<String, Object> model) {
  //   model.put("title", "Welcome Page");
  //   model.put("greeting", "Hello World Spring Boot !!!");
  //   model.put("name", "Guaripolo");
  //   model.put("lastname", "Arrazola");
  //   return "details";
  // }

}
