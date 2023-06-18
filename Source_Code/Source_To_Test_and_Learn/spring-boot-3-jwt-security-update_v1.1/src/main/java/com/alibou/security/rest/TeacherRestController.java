package com.alibou.security.rest;

import com.alibou.security.entity.Teacher;
import com.alibou.security.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherRestController {

    private TeacherService teacherService;

    public TeacherRestController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher")
    public List<Teacher> findAll() {
        List<Teacher> teachers = teacherService.findAll();
        return teachers;
    }

    @GetMapping("/teacher/{teacherId}")
    public Teacher getTeacherById(@PathVariable int teacherId) {
        Teacher teacher = teacherService.findById(teacherId);
        if (teacher == null) {
            throw new RuntimeException("Teacher id not found: " + teacherId);
        }
        return teacher;
    }

    @PostMapping("/teacher")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        teacher.setTeacherId(0);
        Teacher dbTeacher = teacherService.save(teacher);
        return dbTeacher;
    }

    @PutMapping("/teacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher) {
        Teacher dbTeacher = teacherService.save(teacher);
        return dbTeacher;
    }

    @DeleteMapping("/teacher/{teacherId}")
    public String deleteTeacher(@PathVariable int teacherId) {
        Teacher theTeacher = teacherService.findById(teacherId);
        if (theTeacher == null) {
            throw new RuntimeException("Teacher not found: " + teacherId);
        }
        teacherService.deleteById(teacherId);
        return "Deleted teacher id: " + teacherId;
    }
}
