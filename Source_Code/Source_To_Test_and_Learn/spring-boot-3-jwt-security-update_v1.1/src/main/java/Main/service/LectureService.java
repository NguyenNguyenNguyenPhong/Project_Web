package Main.service;



import Main.entity.Lecture;

import java.util.List;

public interface LectureService {
    List<Lecture> findAll();

    Lecture findById(int id);

    Lecture save(Lecture lecture);

    void  deleteById(int id);

}
