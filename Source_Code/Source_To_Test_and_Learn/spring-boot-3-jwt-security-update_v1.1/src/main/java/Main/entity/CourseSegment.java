
package Main.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "coursesegment")
public class CourseSegment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "segmentID")
    private int segmentID;

    @Column(name = "description")
    private String description;

    @Column(name = "courseID")
    private int courseID;

    public CourseSegment() {
    }

    public CourseSegment(int segmentID, String description, int courseID) {
        this.segmentID = segmentID;
        this.description = description;
        this.courseID = courseID;
    }

    public int getSegmentID() {
        return segmentID;
    }

    public void setSegmentID(int segmentID) {
        this.segmentID = segmentID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "CourseSegment{" +
                "segmentID=" + segmentID +
                ", description='" + description + '\'' +
                ", courseID=" + courseID +
                '}';
    }
}
