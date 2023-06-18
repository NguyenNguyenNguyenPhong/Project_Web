package com.alibou.security.dao;

import com.alibou.security.entity.Blog;
import com.alibou.security.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
