package com.alibou.security.rest;

import com.alibou.security.entity.Exam;
import com.alibou.security.service.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExamRestController {

    private ExamService examService;

    public ExamRestController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping("/exam")
    public List<Exam> findAll() {
        List<Exam> exams = examService.findAll();
        return exams;
    }

    @GetMapping("/exam/{examId}")
    public Exam getExamById(@PathVariable int examId) {
        Exam exam = examService.findById(examId);
        if (exam == null) {
            throw new RuntimeException("Exam id not found: " + examId);
        }
        return exam;
    }

    @PostMapping("/exam")
    public Exam addExam(@RequestBody Exam exam) {
        exam.setExamID(0);
        Exam dbExam = examService.save(exam);
        return dbExam;
    }

    @PutMapping("/exam")
    public Exam updateExam(@RequestBody Exam exam) {
        Exam dbExam = examService.save(exam);
        return dbExam;
    }

    @DeleteMapping("/exam/{examId}")
    public String deleteExam(@PathVariable int examId) {
        Exam theExam = examService.findById(examId);
        if (theExam == null) {
            throw new RuntimeException("Exam not found: " + examId);
        }
        examService.deleteById(examId);
        return "Deleted exam id: " + examId;
    }
    @GetMapping("/exam/segment/{segmentID}")
    public List<Exam> getExamsBySegmentID(@PathVariable int segmentID) {
        List<Exam> exams = examService.findBySegmentID(segmentID);
        return exams;
    }
}
