package com.alibou.security.rest;


import com.alibou.security.entity.Lecture;
import com.alibou.security.service.LectureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LectureRestController {

    private LectureService lectureService;

    public LectureRestController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping("/lecture")
    public List<Lecture> findAll() {
        List<Lecture> lectures = lectureService.findAll();
        return lectures;
    }

    @GetMapping("/lecture/{lectureId}")
    public Lecture getLectureById(@PathVariable int lectureId) {
        Lecture lecture = lectureService.findById(lectureId);

        if (lecture == null) {
            throw new RuntimeException("Lecture id not found: " + lectureId);
        }

        return lecture;
    }

    @PostMapping("/lecture")
    public Lecture addLecture(@RequestBody Lecture lecture) {
        lecture.setLectureID(0);
        Lecture dbLecture = lectureService.save(lecture);
        return dbLecture;
    }

    @PutMapping("/lecture")
    public Lecture updateLecture(@RequestBody Lecture lecture) {
        Lecture dbLecture = lectureService.save(lecture);
        return dbLecture;
    }

    @DeleteMapping("/lecture/{lectureId}")
    public String deleteLecture(@PathVariable int lectureId) {
        Lecture theLecture = lectureService.findById(lectureId);

        if (theLecture == null) {
            throw new RuntimeException("Lecture not found: " + lectureId);
        }

        lectureService.deleteById(lectureId);

        return "Deleted lecture id: " + lectureId;
    }
}
