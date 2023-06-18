package Main.service;



import Main.entity.Exam;

import java.util.List;

public interface ExamService {

    List<Exam> findAll();

    Exam findById(int id);

    Exam save(Exam exam);

    void  deleteById(int id);

}
