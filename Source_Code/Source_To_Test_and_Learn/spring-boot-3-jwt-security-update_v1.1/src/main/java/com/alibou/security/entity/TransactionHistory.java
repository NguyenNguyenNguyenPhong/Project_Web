package com.alibou.security.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
@Entity
@Table(name = "transactionhistory")
public class TransactionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionID")
    private int transactionID;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "time", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp time;

    @Column(name = "state")
    private String state;

    @Column(name = "courseID")
    private int courseID;

    @Column(name = "userID")
    private int userID;

    @Column(name = "ispermissionenabled")
    private Boolean isPermissionEnabled;

    public TransactionHistory() {
    }

    public TransactionHistory(Integer cost, String state, int courseID, int userID, Boolean isPermissionEnabled) {
        this.cost = cost;
        this.state = state;
        this.courseID = courseID;
        this.userID = userID;
        this.isPermissionEnabled = isPermissionEnabled;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Boolean getPermissionEnabled() {
        return isPermissionEnabled;
    }

    public void setPermissionEnabled(Boolean permissionEnabled) {
        isPermissionEnabled = permissionEnabled;
    }
}
