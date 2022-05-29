package com.homecooking.demo.payload.request;

public class LoginRequest {

    private String mail;


    private String password;

    public String getMail() {
        return mail;
    }

    public void setMail(String username) {
        this.mail = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}