package ua.project.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.project.pet.model.Course;
import ua.project.pet.repository.CourseRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String id) {
		return courseRepository.findAllByTopicId(id);
	}

	public Course getCourses(String id) {
		return courseRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("No topic with id " + id));
	}

	public void addCourses(Course course) {
		courseRepository.save(course);
	}

	public void updateCourses(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourses(String id) {
		courseRepository.deleteById(id);
	}
}
