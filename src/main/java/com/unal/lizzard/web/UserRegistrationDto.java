package com.unal.lizzard.web;

import com.unal.lizzard.model.Role;

import java.util.Collection;

public class UserRegistrationDto {
    private String username;

    private String email;
    private String password;
    private Collection<Role> roles;
    public UserRegistrationDto(){

    }

    public UserRegistrationDto(String username, String email, String password, Collection<Role> roles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}


