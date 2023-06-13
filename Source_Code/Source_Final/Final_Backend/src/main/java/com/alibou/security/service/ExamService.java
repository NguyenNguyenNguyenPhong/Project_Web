package com.alibou.security.service;



import com.alibou.security.entity.Exam;

import java.util.List;

public interface ExamService {

    List<Exam> findAll();

    Exam findById(int id);

    Exam save(Exam exam);

    void  deleteById(int id);

}
