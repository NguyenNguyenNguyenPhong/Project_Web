package com.alibou.security.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "scopepermission")
public class ScopePermission {

    @Id
    @Column(name = "scopeID")
    private int scopeID;

    @Column(name = "roleID")
    private int roleID;

    @Column(name = "status")
    private String status;

    public ScopePermission() {
    }

    public ScopePermission(int scopeID, int roleID, String status) {
        this.scopeID = scopeID;
        this.roleID = roleID;
        this.status = status;
    }

    public int getScopeID() {
        return scopeID;
    }

    public void setScopeID(int scopeID) {
        this.scopeID = scopeID;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ScopePermission{" +
                "scopeID=" + scopeID +
                ", roleID=" + roleID +
                ", status='" + status + '\'' +
                '}';
    }
}
