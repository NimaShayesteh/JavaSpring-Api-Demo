package com.example.demo.application.auth.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class getTokenOutputDto implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private  String token;
    private Date tokenExpirationDateTime;

    public getTokenOutputDto(String token , Date tokenExpirationDateTime) {
        this.token = token;
        this.tokenExpirationDateTime = tokenExpirationDateTime;
    }

    public String getToken() {
        return token;
    }

    public Date getTokenExpirationDateTime() {
        return tokenExpirationDateTime;
    }
}
