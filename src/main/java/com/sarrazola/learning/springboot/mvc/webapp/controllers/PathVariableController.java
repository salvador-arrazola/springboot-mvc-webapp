package com.sarrazola.learning.springboot.mvc.webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarrazola.learning.springboot.mvc.webapp.models.dto.ParamDto;



@RestController
@RequestMapping("/api/var")
public class PathVariableController {

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

  @GetMapping("/mix/{id}/{product}")
  public Map<String, Object> mix(@PathVariable Long id, @PathVariable String product) {
    Map<String, Object> json = new HashMap<>();
    json.put("id", id);
    json.put("product", product);
    return json;
  }
  
}
