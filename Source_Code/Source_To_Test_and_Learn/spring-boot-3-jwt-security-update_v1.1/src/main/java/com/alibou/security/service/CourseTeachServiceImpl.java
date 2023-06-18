//package com.alibou.security.service;
//
//import com.alibou.security.dao.CourseTeachRepository;
//import com.alibou.security.entity.CourseTeach;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class CourseTeachServiceImpl implements CourseTeachService {
//    private CourseTeachRepository courseTeachRepository;
//
//    @Autowired
//    public CourseTeachServiceImpl(CourseTeachRepository courseTeachRepository) {
//        this.courseTeachRepository = courseTeachRepository;
//    }
//
//    @Override
//    public List<Integer> findCourseIdsByTeacherId(int teacherId) {
//        List<CourseTeach> courseTeaches = courseTeachRepository.findByTeacherId(teacherId);
//        List<Integer> courseIds = new ArrayList<>();
//        for (CourseTeach courseTeach : courseTeaches) {
//            courseIds.add(courseTeach.getCourseId());
//        }
//        return courseIds;
//    }
//}