
package com.twd.SpringSecurityJWT.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.twd.SpringSecurityJWT.entity.OurUsers;
import com.twd.SpringSecurityJWT.entity.Product;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReqRes {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String name;
    private String email;
    private String role;
    private String password;
    private List<Product> products;
    private OurUsers ourUsers;



    public void setStatusCode(int i) {
    }

    public void setToken(String jwt) {
    }

    public void setRefreshToken(String refreshToken) {
    }

    public void setExpirationTime(String s) {
    }

    public String getToken() {
        return null;
    }

    public void setMessage(String successfullyRefreshedToken) {
    }

    public String getEmail() {
        return null;
    }

    public void setError(String message) {
    }



    public CharSequence getPassword() {
        return  null;
    }

    public void setOurUsers(com.twd.SpringSecurityJWT.entity.OurUsers ourUserResult) {

    }


    public Object getRole() {
        return null;
    }

    public Object getName() {
        return null;
    }
}
