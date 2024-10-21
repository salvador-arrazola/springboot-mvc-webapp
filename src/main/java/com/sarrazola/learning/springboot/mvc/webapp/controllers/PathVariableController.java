package com.sarrazola.learning.springboot.mvc.webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarrazola.learning.springboot.mvc.webapp.models.User;
import com.sarrazola.learning.springboot.mvc.webapp.models.dto.ParamDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

  @Value("${config.code}")
  private Long code;

  @Value("${config.username}")
  private String username;

  @Value("${config.message}")
  private String message;

  @Value("${config.list}")
  private String[] list;

  @GetMapping("/baz/{message}")
  public ParamDto baz(@PathVariable String message) {
      return new ParamDto(message);
    }

    @GetMapping("/mix/{product}/{id}")
  public Map<String, Object> mix(@PathVariable String product, @PathVariable Long id) {
    Map<String, Object> json = new HashMap<>();
    json.put("product", product);
    json.put("id", id);
    return json;
  }

  @PostMapping("/create")
  public User create(@RequestBody User user) {
    // Do something with parameter user (store it in the database).
    user.setName(user.getName().toUpperCase());
    return user;
  }

  @GetMapping("/values")
  public Map<String, Object> values() {
    Map<String, Object> json = new HashMap<>();
    json.put("Code", code);
    json.put("Username", username);
    json.put("Message", message);
    json.put("List", list);
    return json;
  }

  @GetMapping("/values1")
  public Map<String, Object> values1(
    @Value("${config.username}") String username,
    @Value("${config.message}") String message) {
    Map<String, Object> json = new HashMap<>();
    json.put("Username", username);
    json.put("Message", message);
    return json;
  }
  
}
