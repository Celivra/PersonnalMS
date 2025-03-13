package com.celivra.personnalms.Entity;

public class User {
    private String id;
    private String username;
    private String password;
    private String email;

    public User(){}
    public User(String username, String password , String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public User(String id, String username, String password , String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password;
    }



}
