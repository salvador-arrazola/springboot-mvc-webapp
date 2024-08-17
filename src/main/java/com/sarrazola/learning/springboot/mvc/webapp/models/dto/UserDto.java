package com.sarrazola.learning.springboot.mvc.webapp.models.dto;

import com.sarrazola.learning.springboot.mvc.webapp.models.User;

public class UserDto {

  private String greeting;
  private User user;

  public UserDto() { }

  public String getGreeting() {
    return greeting;
  }
  
  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public User getUser() {
    return user;
  }
  
  public void setUser(User user) {
    this.user = user;
  }

}
