package com.alibou.security.rest;


import com.alibou.security.entity.Course;
import com.alibou.security.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseRestController {

    private CourseService courseService;

    public CourseRestController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/course")
    public List<Course> findAll(){
        List<Course> courses = courseService.findAll();

        return courses;
    }

    // add mapping for GET/employees/{employeeId}

    @GetMapping("/course/{courseId}")
    public Course getCourseById(@PathVariable int courseId){
        Course course = courseService.findById(courseId);

        if(course == null){
            throw new RuntimeException("Course id not found_" + courseId);
        }
        return course;
    }

    // add mapping for POST /employees - add new employee
    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course){
        course.setCourseID(0);
        Course dbCourse = courseService.save(course);
        return dbCourse;
    }

    // add Mapping for Put
    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){
        Course dbCourse = courseService.save(course);
        return dbCourse;
    }

    // add Mapping for Delete / employees/{employeeId}

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable int courseId) {
        Course theCourse = courseService.findById(courseId);

        if (theCourse == null) {
            throw new RuntimeException("Course is not found " + courseId);
        }
        courseService.deleteById(courseId);

        return "Deleted course id " + courseId;
    }
}
