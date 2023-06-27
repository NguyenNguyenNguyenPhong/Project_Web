package com.alibou.security.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "user")
public class User_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private int userID;

    @Column(name = "email")
    private String email;

    @Column(name = "passWord")
    private String password;

    @Column(name = "scopeID")
    private int scopeID;

    public User_Entity() {
    }

    public User_Entity(String email, String password, int scopeID) {
        this.email = email;
        this.password = password;
        this.scopeID = scopeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public int getScopeID() {
        return scopeID;
    }

    public void setScopeID(int scopeID) {
        this.scopeID = scopeID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", scopeID=" + scopeID +
                '}';
    }
}
