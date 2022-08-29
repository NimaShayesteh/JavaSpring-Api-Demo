package com.example.demo.auth.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class getTokenOutputDto implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private  String token;

    public getTokenOutputDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }




}
