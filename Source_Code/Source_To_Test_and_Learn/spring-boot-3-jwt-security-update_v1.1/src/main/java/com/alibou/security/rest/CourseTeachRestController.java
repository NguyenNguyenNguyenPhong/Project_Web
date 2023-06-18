//package com.alibou.security.rest;
//
//import com.alibou.security.service.CourseTeachService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class CourseTeachRestController {
//    private CourseTeachService courseTeachService;
//
//    @Autowired
//    public CourseTeachRestController(CourseTeachService courseTeachService) {
//        this.courseTeachService = courseTeachService;
//    }
//
//    @GetMapping("/teacher/{teacherId}/courseIds")
//    public List<Integer> getCourseIdsByTeacherId(@PathVariable int teacherId) {
//        return courseTeachService.findCourseIdsByTeacherId(teacherId);
//    }
//}