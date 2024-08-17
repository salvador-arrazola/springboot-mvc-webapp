package com.sarrazola.learning.springboot.mvc.webapp.models;

public class User {

  private String name;
  private String lastname;

  public User(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
  }
  
  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

}
