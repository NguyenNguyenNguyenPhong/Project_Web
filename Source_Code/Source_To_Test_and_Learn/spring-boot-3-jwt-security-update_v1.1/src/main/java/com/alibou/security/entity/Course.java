package com.alibou.security.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "courseID")
    private int courseID;

    @Column(name = "coursename", nullable = false)
    private String courseName;

    @Column(name = "coursedescription", nullable = false)
    private String courseDescription;

    @Column(name = "courseimg", nullable = false)
    private String courseImg;

    @Column(name = "coursecost")
    private int courseCost;

    @Column(name = "courserating")
    private int courseRating;

    @Column(name = "createdat", nullable = false)
    private Timestamp createdAt;

    @Column(name = "coursetotalstudent")
    private int courseTotalStudent;

    @Column(name = "lastupdate", nullable = false)
    private Timestamp lastUpdate;

    @Column(name = "categoryID")
    private int categoryID;

    @Column(name = "userID")
    private int userID;

    public Course() {
    }

    public Course(String courseName, String courseDescription, String courseImg, int courseCost, int courseRating,
                  Timestamp createdAt, int courseTotalStudent, Timestamp lastUpdate, int categoryID, int userID) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseImg = courseImg;
        this.courseCost = courseCost;
        this.courseRating = courseRating;
        this.createdAt = createdAt;
        this.courseTotalStudent = courseTotalStudent;
        this.lastUpdate = lastUpdate;
        this.categoryID = categoryID;
        this.userID = userID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public int getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(int courseCost) {
        this.courseCost = courseCost;
    }

    public int getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(int courseRating) {
        this.courseRating = courseRating;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getCourseTotalStudent() {
        return courseTotalStudent;
    }

    public void setCourseTotalStudent(int courseTotalStudent) {
        this.courseTotalStudent = courseTotalStudent;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", courseImg='" + courseImg + '\'' +
                ", courseCost=" + courseCost +
                ", courseRating=" + courseRating +
                ", createdAt=" + createdAt +
                ", courseTotalStudent=" + courseTotalStudent +
                ", lastUpdate=" + lastUpdate +
                ", categoryID=" + categoryID +
                ", userID=" + userID +
                '}';
    }
}
