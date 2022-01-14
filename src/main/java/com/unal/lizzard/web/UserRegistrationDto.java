package com.unal.lizzard.web;

public class UserRegistrationDto {

    private String username;
    private String password;
    private String role;

    public UserRegistrationDto(String username, String role, String password) {

        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UserRegistrationDto() {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String lastName) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String email) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



