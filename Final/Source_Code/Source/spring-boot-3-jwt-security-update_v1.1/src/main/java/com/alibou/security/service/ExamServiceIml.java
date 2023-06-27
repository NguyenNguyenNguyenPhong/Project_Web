package com.alibou.security.service;

import com.alibou.security.dao.ExamRepository;
import com.alibou.security.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamServiceIml implements ExamService {

    private ExamRepository examRepository;

    @Autowired
    public ExamServiceIml(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @Override
    public List<Exam> findAll() {
        return examRepository.findAll();
    }

    @Override
    public Exam findById(int id) {
        Optional<Exam> result = examRepository.findById(id);
        Exam exam = null;
        if (result.isPresent()) {
            exam = result.get();
        } else {
            throw new RuntimeException("Did not find Exam id: " + id);
        }
        return exam;
    }

    @Override
    public Exam save(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public void deleteById(int id) {
        examRepository.deleteById(id);
    }
    @Override
    public List<Exam> findBySegmentID(int segmentID) {
        return examRepository.findBySegmentID(segmentID);
    }
}
