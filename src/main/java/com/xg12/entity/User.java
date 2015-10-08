package com.xg12.entity;

public class User {
    private Integer userId;

    private String username;

    private String password;

    private String name;

    private Boolean stuts;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getStuts() {
        return stuts;
    }

    public void setStuts(Boolean stuts) {
        this.stuts = stuts;
    }
}