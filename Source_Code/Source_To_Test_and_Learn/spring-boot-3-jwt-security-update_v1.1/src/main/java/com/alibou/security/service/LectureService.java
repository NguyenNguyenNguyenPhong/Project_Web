package com.alibou.security.service;



import com.alibou.security.entity.Lecture;

import java.util.List;

public interface LectureService {
    List<Lecture> findAll();

    Lecture findById(int id);

    Lecture save(Lecture lecture);

    void  deleteById(int id);

}
