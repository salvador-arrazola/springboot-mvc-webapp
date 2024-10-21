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
import org.springframework.web.bind.annotation.RequestParam;


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
  // @PathVariable MUST have the same as defined in @RequestMapping.
  // public ParamDto baz(@PathVariable String msg) {
  // @PathVariables are required by default (required = true), but even if you change this option
  // to false, the @PathVariable will still be required and you will get an error when calling the
  // api with no value for the path variable:
  // public ParamDto baz(@PathVariable(required = false) String message) {
      return new ParamDto(message);
      // return new ParamDto(msg);
  }

  // REMINDER: Do not forget to put the value for path variables after the last slash (/) when
  // opening the api URL.

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
  
}
