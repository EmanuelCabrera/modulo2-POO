package com.mindhub.domain;


public class UserProfile {
   private String userName;
   private String email;
   private String password;

   public UserProfile() {
   }

   public void setUserName(String userName) {
    this.userName = userName;
   }

   public String getUserName() {
    return userName;
   }

   public void setEmail(String email) {
    if(!email.contains("@")) {
        throw new IllegalArgumentException("Email must contain @");
    }
    this.email = email;
   }

   public String getEmail() {
    return email;
   }

   public void setPassword(String password) {
    if(password.length() < 8) {
        throw new IllegalArgumentException("Password must be at least 8 characters long");
    }
    this.password = password;
   }

   public String getPassword() {
    return password;
   }
}