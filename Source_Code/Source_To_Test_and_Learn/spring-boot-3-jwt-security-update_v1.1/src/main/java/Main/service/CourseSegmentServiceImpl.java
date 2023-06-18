package Main.service;


import Main.dao.CourseSegmentRepository;
import Main.entity.CourseSegment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseSegmentServiceImpl implements CourseSegmentService{

    private CourseSegmentRepository courseSegmentRepository;

    @Autowired
    public CourseSegmentServiceImpl(CourseSegmentRepository courseSegmentRepository) {
        this.courseSegmentRepository = courseSegmentRepository;
    }

    @Override
    public List<CourseSegment> findAll() {
        return courseSegmentRepository.findAll();
    }

    @Override
    public CourseSegment findById(int id) {
        Optional<CourseSegment> result = courseSegmentRepository.findById(id);
        CourseSegment courseSegment = null;
        if (result.isPresent()) {
            courseSegment = result.get();
        } else {
            throw new RuntimeException("Did not find CourseSegment id: " + id);
        }
        return courseSegment;
    }

    @Override
    public CourseSegment save(CourseSegment courseSegment) {
        return courseSegmentRepository.save(courseSegment);
    }

    @Override
    public void deleteById(int id) {
        courseSegmentRepository.deleteById(id);
    }
}
