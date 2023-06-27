package com.alibou.security.rest;

import com.alibou.security.entity.CourseSegment;
import com.alibou.security.service.CourseSegmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseSegmentRestController {

    private CourseSegmentService courseSegmentService;

    public CourseSegmentRestController(CourseSegmentService courseSegmentService) {
        this.courseSegmentService = courseSegmentService;
    }

    @GetMapping("/coursesegment")
    public List<CourseSegment> findAll() {
        List<CourseSegment> courseSegments = courseSegmentService.findAll();
        return courseSegments;
    }

    @GetMapping("/coursesegment/{segmentId}")
    public CourseSegment getCourseSegmentById(@PathVariable int segmentId) {
        CourseSegment courseSegment = courseSegmentService.findById(segmentId);
        if (courseSegment == null) {
            throw new RuntimeException("CourseSegment not found: " + segmentId);
        }
        return courseSegment;
    }

    @PostMapping("/coursesegment")
    public CourseSegment addCourseSegment(@RequestBody CourseSegment courseSegment) {
        courseSegment.setSegmentID(0);
        CourseSegment dbCourseSegment = courseSegmentService.save(courseSegment);
        return dbCourseSegment;
    }

    @PutMapping("/coursesegment")
    public CourseSegment updateCourseSegment(@RequestBody CourseSegment courseSegment) {
        CourseSegment dbCourseSegment = courseSegmentService.save(courseSegment);
        return dbCourseSegment;
    }

    @DeleteMapping("/coursesegment/{segmentId}")
    public String deleteCourseSegment(@PathVariable int segmentId) {
        CourseSegment theCourseSegment = courseSegmentService.findById(segmentId);
        if (theCourseSegment == null) {
            throw new RuntimeException("CourseSegment not found: " + segmentId);
        }
        courseSegmentService.deleteById(segmentId);
        return "Deleted CourseSegment with ID: " + segmentId;
    }
    @GetMapping("/course-segments/course/{courseID}")
    public ResponseEntity<List<CourseSegment>> getCourseSegmentsByCourseID(@PathVariable int courseID) {
        List<CourseSegment> courseSegments = courseSegmentService.getCourseSegmentsByCourseID(courseID);
        if (courseSegments.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(courseSegments, HttpStatus.OK);
    }
}
