//package com.alibou.security.entity;
//
//import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;
//
//@Entity
//@Table(name = "course_teach")
//public class CourseTeach {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "course_teach_id")
//    private int courseTeachId;
//
//    @Column(name = "courseID")
//    private int courseId;
//
//    @Column(name = "teacherID")
//    private int teacherId;
//
//    // Getters and setters, constructors, etc.
//
//    public int getCourseTeachId() {
//        return courseTeachId;
//    }
//
//    public void setCourseTeachId(int courseTeachId) {
//        this.courseTeachId = courseTeachId;
//    }
//
//    public int getCourseId() {
//        return courseId;
//    }
//
//    public void setCourseId(int courseId) {
//        this.courseId = courseId;
//    }
//
//    public int getTeacherId() {
//        return teacherId;
//    }
//
//    public void setTeacherId(int teacherId) {
//        this.teacherId = teacherId;
//    }
//}
