package com.bezkoder.spring.security.mongodb.payload.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
  @NotBlank
  private String mobilenumber;

  @NotBlank
  private String password;

  public String getmobilenumber() {
    return mobilenumber;
  }

  public void setUsername(String mobilenumber) {
    this.mobilenumber = mobilenumber;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
