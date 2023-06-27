package com.alibou.security.service;

import com.alibou.security.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> findAll();

    Teacher findById(int id);

    Teacher save(Teacher teacher);

    void deleteById(int id);

}
