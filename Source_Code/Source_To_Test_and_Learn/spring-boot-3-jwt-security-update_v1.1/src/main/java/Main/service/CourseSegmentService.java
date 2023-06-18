package Main.service;



import Main.entity.CourseSegment;

import java.util.List;

public interface CourseSegmentService {

    List<CourseSegment> findAll();

    CourseSegment findById(int id);

    CourseSegment save(CourseSegment courseSegment);

    void  deleteById(int id);

}
