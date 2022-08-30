package com.example.demo.base;

import java.util.Date;

public class TokenObjectClass{
    public String Token;
    public Date TokenExpireDateTime;

    public String getToken() {
        return Token;
    }

    public Date getTokenExpireDateTime() {
        return TokenExpireDateTime;
    }
}
