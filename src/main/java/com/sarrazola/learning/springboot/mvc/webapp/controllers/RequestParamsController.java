package com.sarrazola.learning.springboot.mvc.webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarrazola.learning.springboot.mvc.webapp.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

  @GetMapping("/foo")
  // Params are required by default: @RequestParam(required = true).
  // public ParamDto foo(@RequestParam String message) {
  // You can change this option:
  // public ParamDto foo(@RequestParam(required = false) String message) {
  // Also, you can provide a default value:
  // public ParamDto foo(@RequestParam(required = false, defaultValue = "No message received.") String message) {
  // By default, params in URL must have the same name as method params (message > message).
  // We can map a param from the URL to the method using:
  public ParamDto foo(@RequestParam(required = false, defaultValue = "No message received.", name = "msg") String message) {
    // Params not provided can be validated in order to avoid showing null value in the response.
    // return new ParamDto(message != null ? message : "No message received.");
    return new ParamDto(message);
  }

  @GetMapping("/bar")
  public ParamDto bar(@RequestParam String message, @RequestParam Integer code) {
    return new ParamDto(message, code);
  }
  
  @GetMapping("/request")
  public ParamDto request(HttpServletRequest request) {
    Integer code = 0;
    try {
      code = Integer.parseInt(request.getParameter("code"));
    } catch (Exception e) { }
    ParamDto params = new ParamDto();
    params.setMessage(request.getParameter("message"));
    params.setCode(code);
    return params;
  }

}
