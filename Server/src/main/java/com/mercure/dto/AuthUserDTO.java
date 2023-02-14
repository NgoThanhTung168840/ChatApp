package com.mercure.dto;

import com.mercure.dto.user.GroupDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class AuthUserDTO {

    private int id;

    private String username;

    private String firstGroupUrl;

    private String wsToken;

    private List<GroupDTO> groups;

    public AuthUserDTO() {
    }

    public AuthUserDTO(int id, String username, String firstGroupUrl, String wsToken, List<GroupDTO> groups) {
        this.id = id;
        this.username = username;
        this.firstGroupUrl = firstGroupUrl;
        this.wsToken = wsToken;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstGroupUrl() {
        return firstGroupUrl;
    }

    public void setFirstGroupUrl(String firstGroupUrl) {
        this.firstGroupUrl = firstGroupUrl;
    }

    public String getWsToken() {
        return wsToken;
    }

    public void setWsToken(String wsToken) {
        this.wsToken = wsToken;
    }

    public List<GroupDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDTO> groups) {
        this.groups = groups;
    }
}
