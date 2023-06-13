package com.alibou.security.entity;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "lecture")
public class Lecture {

    @Id
    @Column(name = "lectureid")
    private int lectureID;

    @Column(name = "lecturename")
    private String lectureName;

    @Column(name = "lecturedescription")
    private String lectureDescription;

    @Column(name = "lecturevideolink", nullable = false)
    private String lectureVideoLink;

    @Column(name = "lectureimage", nullable = false)
    private String lectureImage;

    @Column(name = "lectureslug", nullable = false)
    private String lectureSlug;

    @Column(name = "createdat", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "lastupdate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    @Column(name = "segmentid")
    private int segmentID;

    @Column(name = "lectureseqnumber")
    private int lectureSeqNumber;

    public Lecture() {
    }

    public Lecture(int lectureID, String lectureName, String lectureDescription, String lectureVideoLink,
                   String lectureImage, String lectureSlug, int segmentID, int lectureSeqNumber) {
        this.lectureID = lectureID;
        this.lectureName = lectureName;
        this.lectureDescription = lectureDescription;
        this.lectureVideoLink = lectureVideoLink;
        this.lectureImage = lectureImage;
        this.lectureSlug = lectureSlug;
        this.segmentID = segmentID;
        this.lectureSeqNumber = lectureSeqNumber;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getLectureDescription() {
        return lectureDescription;
    }

    public void setLectureDescription(String lectureDescription) {
        this.lectureDescription = lectureDescription;
    }

    public String getLectureVideoLink() {
        return lectureVideoLink;
    }

    public void setLectureVideoLink(String lectureVideoLink) {
        this.lectureVideoLink = lectureVideoLink;
    }

    public String getLectureImage() {
        return lectureImage;
    }

    public void setLectureImage(String lectureImage) {
        this.lectureImage = lectureImage;
    }

    public String getLectureSlug() {
        return lectureSlug;
    }

    public void setLectureSlug(String lectureSlug) {
        this.lectureSlug = lectureSlug;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getSegmentID() {
        return segmentID;
    }

    public void setSegmentID(int segmentID) {
        this.segmentID = segmentID;
    }

    public int getLectureSeqNumber() {
        return lectureSeqNumber;
    }

    public void setLectureSeqNumber(int lectureSeqNumber) {
        this.lectureSeqNumber = lectureSeqNumber;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureID=" + lectureID +
                ", lectureName='" + lectureName + '\'' +
                ", lectureDescription='" + lectureDescription + '\'' +
                ", lectureVideoLink='" + lectureVideoLink + '\'' +
                ", lectureImage='" + lectureImage + '\'' +
                ", lectureSlug='" + lectureSlug + '\'' +
                ", createdAt=" + createdAt +
                ", lastUpdate=" + lastUpdate +
                ", segmentID=" + segmentID +
                ", lectureSeqNumber=" + lectureSeqNumber +
                '}';
    }
}
