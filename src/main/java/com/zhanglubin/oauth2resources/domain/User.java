package com.zhanglubin.oauth2resources.domain;

/**
 * @author zhanglubin
 * @date 2021/2/20
 */
public class User {

    private String username;
    private String passoword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    public User(String username, String passoword) {
        this.username = username;
        this.passoword = passoword;
    }

    public User() {
    }
}
