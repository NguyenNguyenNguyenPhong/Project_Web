package Main.dao;


import Main.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository<Course, Integer> {

}
