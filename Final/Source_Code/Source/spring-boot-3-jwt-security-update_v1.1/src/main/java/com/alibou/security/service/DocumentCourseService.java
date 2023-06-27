package com.alibou.security.service;

import com.alibou.security.entity.DocumentCourse;
import com.alibou.security.entity.Exam;

import java.util.List;

public interface DocumentCourseService {
    List<DocumentCourse> findAll();

    DocumentCourse findById(int id);

    DocumentCourse save(DocumentCourse documentCourse);

    void  deleteById(int id);
    List<DocumentCourse> findByCourseId(int courseId);
}
