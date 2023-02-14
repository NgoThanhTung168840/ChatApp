package com.mercure.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class UserDTO {

    private int id;

    private String firstName;

    private String lastName;

    private String password;

    private String jwt;

    private String wsToken;

    private String firstGroupUrl;

    public UserDTO(int id, String firstName, String lastName, String password, String jwt, String wsToken, String firstGroupUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.jwt = jwt;
        this.wsToken = wsToken;
        this.firstGroupUrl = firstGroupUrl;
    }

    public UserDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public String getWsToken() {
        return wsToken;
    }

    public void setWsToken(String wsToken) {
        this.wsToken = wsToken;
    }

    public String getFirstGroupUrl() {
        return firstGroupUrl;
    }

    public void setFirstGroupUrl(String firstGroupUrl) {
        this.firstGroupUrl = firstGroupUrl;
    }
}
