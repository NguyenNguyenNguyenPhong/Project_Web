package com.TestSpringAPI.demo.rest;

import com.TestSpringAPI.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> thestudents;
    @PostConstruct
    public void loadData(){

        thestudents = new ArrayList<Student>();
        thestudents.add(new Student("Nguyen Minh", "Thuong"));
        thestudents.add(new Student("Nguyen Minh", "Anh"));
        thestudents.add(new Student("Nguyen Minh", "Nguyen"));
        thestudents.add(new Student("Nguyen Minh", "Hung"));
        thestudents.add(new Student("Nguyen Minh", "Phong"));
    }
    // define endpoint for "/students" -return a lisst of studenrs

    @GetMapping("/students")
    public List<Student> getStudents(){
        return thestudents;
    }

    // define endpoint or "/students{studentID} - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if((studentId >= thestudents.size()) || (studentId <0)){
            throw new StudentNotFoundExceception("Student id not found -" + studentId);
        }
        return thestudents.get(studentId);
    }


}


