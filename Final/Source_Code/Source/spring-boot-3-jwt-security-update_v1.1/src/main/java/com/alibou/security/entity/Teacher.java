package com.alibou.security.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @Column(name = "teacherid")
    private int teacherId;

    @Column(name = "fullname", nullable = false)
    private String fullName;

    @Column(name = "phonenumber", nullable = false)
    private String phoneNumber;

    @Column(name = "img")
    private String img;

    @Column(name = "intro")
    private String intro;

    public Teacher() {
    }

    public Teacher(int teacherId, String fullName, String phoneNumber, String img, String intro) {
        this.teacherId = teacherId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.img = img;
        this.intro = intro;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", img='" + img + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
