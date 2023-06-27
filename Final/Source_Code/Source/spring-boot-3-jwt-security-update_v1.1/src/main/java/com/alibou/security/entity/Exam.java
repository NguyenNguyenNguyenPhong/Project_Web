package com.alibou.security.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "examID")
    private int examID;

    @Column(name = "finishtime")
    private Timestamp finishTime;

    @Column(name = "examlink", columnDefinition = "TEXT", nullable = false)
    private String examLink;


    @Column(name = "segmentID")
    private int segmentID;

    @Column(name = "starttime")
    private Timestamp startTime;

    public Exam() {
    }

    public Exam(int examID, Timestamp finishTime, String examLink, int lectureID, Timestamp startTime) {
        this.examID = examID;
        this.finishTime = finishTime;
        this.examLink = examLink;

        this.segmentID = segmentID;
        this.startTime = startTime;
    }

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public Timestamp getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime;
    }

    public String getExamLink() {
        return examLink;
    }

    public void setExamLink(String examLink) {
        this.examLink = examLink;
    }



    public int getsegmentID() {
        return segmentID;
    }

    public void setsegmentID(int segmentID) {
        this.segmentID = segmentID;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examID=" + examID +
                ", finishTime=" + finishTime +
                ", examLink='" + examLink + '\'' +

                ", lectureID=" + segmentID +
                ", startTime=" + startTime +
                '}';
    }
}
