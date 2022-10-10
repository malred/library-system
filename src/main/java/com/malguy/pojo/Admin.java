package com.malguy.pojo;

public class Admin {
  private Long id;
  private String username;
  private String password;
  private long adminType;
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public long getAdminType() {
    return adminType;
  }
  public void setAdminType(long adminType) {
    this.adminType = adminType;
  }
}
