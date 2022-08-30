package com.example.demo.application.auth.controller;

import com.example.demo.application.auth.dto.getTokenInputDto;
import com.example.demo.application.auth.dto.getTokenOutputDto;
import com.example.demo.application.auth.config.JwtTokenUtil;
import com.example.demo.application.auth.service.JwtUserDetailsService;


import com.example.demo.domain.base.BaseResponse;
import com.example.demo.domain.base.TokenObjectClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "api/v1")
@CrossOrigin
public class AuthenticateController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;




    @RequestMapping(path = "/authenticate" , method = RequestMethod.POST)
    public BaseResponse<ResponseEntity<?> > createAuthenticationToken(@RequestBody getTokenInputDto authenticationRequest)throws  Exception{
        final BaseResponse FinalResponse = new BaseResponse();
        authenticationRequest.setUserName("javainuse");
        authenticate(authenticationRequest.getUserName(), authenticationRequest.getPassword());

        final UserDetails userDetails = jwtUserDetailsService
                .loadUserByUsername(authenticationRequest.getUserName());

        var tokenclass  = new TokenObjectClass();
        tokenclass = jwtTokenUtil.generateToken(userDetails);

        FinalResponse.setResult(ResponseEntity.ok(new getTokenOutputDto(tokenclass.getToken(), tokenclass.getTokenExpireDateTime())));
        FinalResponse.setHasError(false);
        return  FinalResponse;
    }


    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }



}
