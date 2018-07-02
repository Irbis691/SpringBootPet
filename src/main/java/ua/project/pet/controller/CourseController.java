package ua.project.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.project.pet.model.Course;
import ua.project.pet.model.Topic;
import ua.project.pet.service.CourseService;

import java.util.List;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable("id") String id) {
		return courseService.getAllCourses(id);
	}

	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourses(@PathVariable("id") String id) {
		return courseService.getCourses(id);
	}

	@RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.POST)
	public void addCourses(@PathVariable String topicId, @RequestBody Course course) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourses(course);
	}

	@RequestMapping(value = "/topics/{topicId}/courses/{id}", method = RequestMethod.PUT)
	public void updateCourses(@PathVariable String topicId, @RequestBody Course course, @PathVariable("id") String id) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourses(course);
	}

	@RequestMapping(value = "/topics/{topicId}/courses/{id}", method = RequestMethod.DELETE)
	public void deleteCourses(@PathVariable("id") String id) {
		courseService.deleteCourses(id);
	}
}
