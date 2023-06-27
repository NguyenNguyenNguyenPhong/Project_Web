package com.alibou.security.dao;

import com.alibou.security.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamRepository extends JpaRepository<Exam, Integer> {
    List<Exam> findBySegmentID(int segmentID);
}
