package com.alibou.security.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "learnhistory")
public class LearnHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "iscompleted")
    private boolean isCompleted;

    @Column(name = "timetocomplete")
    private Integer timeToComplete;

    @Column(name = "grade")
    private Integer grade;

    @Column(name = "lectureID")
    private int lectureID;

    @Column(name = "userID")
    private int userID;

    public LearnHistory() {
    }

    public LearnHistory(boolean isCompleted, Integer timeToComplete, Integer grade, int lectureID, int userID) {
        this.isCompleted = isCompleted;
        this.timeToComplete = timeToComplete;
        this.grade = grade;
        this.lectureID = lectureID;
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Integer getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(Integer timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
