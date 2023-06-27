package com.alibou.security.entity;

import com.alibou.security.entity.Course;
import jakarta.persistence.*;

@Entity
@Table(name = "documentcourse")
public class DocumentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "documentID")
    private int documentID;

    @Column(name = "cntdocument", nullable = false)
    private String cntDocument;
    @Column(name = "courseID")
    private int courseID;

    public DocumentCourse() {
    }

    public DocumentCourse(int documentID, String cntDocument, int courseID) {
        this.documentID = documentID;
        this.cntDocument = cntDocument;
        this.courseID = courseID;
    }

    public int getDocumentID() {
        return documentID;
    }

    public void setDocumentID(int documentID) {
        this.documentID = documentID;
    }

    public String getCntDocument() {
        return cntDocument;
    }

    public void setCntDocument(String cntDocument) {
        this.cntDocument = cntDocument;
    }

    public int getCourse() {
        return courseID;
    }

    public void setCourse(int course) {
        this.courseID = course;
    }
}
