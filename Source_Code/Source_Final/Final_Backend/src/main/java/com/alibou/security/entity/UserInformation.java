package com.alibou.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "userinformation")
public class UserInformation {

    @Id
    @Column(name = "userID")
    private int userID;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "img")
    private String img;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "isVerified")
    private Boolean isVerified;

    @Column(name = "roleID")
    private int roleID;

    public UserInformation() {
    }

    public UserInformation(int userID, String fullName, String phoneNumber, String img, Timestamp createdAt, Boolean isVerified, int roleID) {
        this.userID = userID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.img = img;
        this.createdAt = createdAt;
        this.isVerified = isVerified;
        this.roleID = roleID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "userID=" + userID +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", img='" + img + '\'' +
                ", createdAt=" + createdAt +
                ", isVerified=" + isVerified +
                ", roleID=" + roleID +
                '}';
    }
}
