package com.example.demo.auth.dto;

import java.io.Serializable;

public class getTokenInputDto implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;
    private String username;
    private String password;


    public getTokenInputDto() {
    }

    public getTokenInputDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
