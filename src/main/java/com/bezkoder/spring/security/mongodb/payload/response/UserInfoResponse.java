package com.bezkoder.spring.security.mongodb.payload.response;

import java.util.List;

public class UserInfoResponse {
  private String id;
  private String username;

  private String mobilenumber;
  private List<String> roles;

  public UserInfoResponse(String id, String username, String mobilenumber, List<String> roles) {
    this.id = id;
    this.username = username;
    this.mobilenumber = mobilenumber;
    this.roles = roles;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getmobilenumber() {
    return mobilenumber;
  }

  public void setmobilenumber(String mobilenumber) {
    this.mobilenumber = mobilenumber;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<String> getRoles() {
    return roles;
  }
}
