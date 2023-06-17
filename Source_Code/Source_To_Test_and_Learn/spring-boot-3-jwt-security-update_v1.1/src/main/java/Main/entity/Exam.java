package Main.entity;

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

    @Column(name = "state", nullable = false, length = 256)
    private String state;

    @Column(name = "score")
    private Integer score;

    @Column(name = "lectureID")
    private int lectureID;

    @Column(name = "starttime")
    private Timestamp startTime;

    public Exam() {
    }

    public Exam(int examID, Timestamp finishTime, String examLink, String state, Integer score, int lectureID, Timestamp startTime) {
        this.examID = examID;
        this.finishTime = finishTime;
        this.examLink = examLink;
        this.state = state;
        this.score = score;
        this.lectureID = lectureID;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
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
                ", state='" + state + '\'' +
                ", score=" + score +
                ", lectureID=" + lectureID +
                ", startTime=" + startTime +
                '}';
    }
}
