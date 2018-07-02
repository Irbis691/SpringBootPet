package ua.project.pet.repository;

import org.springframework.data.repository.CrudRepository;
import ua.project.pet.model.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

	List<Course> findAllByTopicId(String topicId);

}
