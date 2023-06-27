package com.alibou.security.dao;

import com.alibou.security.entity.DocumentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentCourseRepository extends JpaRepository<DocumentCourse, Integer> {
    List<DocumentCourse> findByCourseID(int courseId);
}
