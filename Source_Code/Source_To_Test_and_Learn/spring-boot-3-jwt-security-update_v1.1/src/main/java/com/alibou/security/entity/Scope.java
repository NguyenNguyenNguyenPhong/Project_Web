package com.alibou.security.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "scope")
public class Scope {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ScopeID")
    private int scopeID;

    @Column(name = "admin")
    private boolean admin;

    @Column(name = "teacher")
    private boolean teacher;

    @Column(name = "student")
    private boolean student;

    @Column(name = "user")
    private boolean user;

    public Scope() {
    }

    public Scope(int scopeID, boolean admin, boolean teacher, boolean student, boolean user) {
        this.scopeID = scopeID;
        this.admin = admin;
        this.teacher = teacher;
        this.student = student;
        this.user = user;
    }

    public int getScopeID() {
        return scopeID;
    }

    public void setScopeID(int scopeID) {
        this.scopeID = scopeID;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isTeacher() {
        return teacher;
    }

    public void setTeacher(boolean teacher) {
        this.teacher = teacher;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Scope{" +
                "scopeID=" + scopeID +
                ", admin=" + admin +
                ", teacher=" + teacher +
                ", student=" + student +
                ", user=" + user +
                '}';
    }
}
