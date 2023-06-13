package com.alibou.security.service;


import com.alibou.security.dao.CourseRepository;
import com.alibou.security.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    private CourseRepository courseRepository;
    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAll() {
        List<Course> courses = courseRepository.findAll();

        return courses;
    }

    @Override
    public Course findById(int id) {
        Optional<Course> result = courseRepository.findById(id);
        Course course = null;
        if(result.isPresent()){
            course = result.get();
        }else{
            throw new RuntimeException("Did not find Course id" + id);
        }
        return course;
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseRepository.deleteById(id);
    }
}
