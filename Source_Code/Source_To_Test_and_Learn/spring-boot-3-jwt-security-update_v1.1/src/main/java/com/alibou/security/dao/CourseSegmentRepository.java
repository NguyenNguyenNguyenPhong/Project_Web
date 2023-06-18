package com.alibou.security.dao;

import com.alibou.security.entity.CourseSegment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSegmentRepository extends JpaRepository<CourseSegment, Integer> {
    List<CourseSegment> findByCourseID(int courseID);
}
