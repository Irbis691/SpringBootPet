package ua.project.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.project.pet.model.Topic;
import ua.project.pet.repository.TopicRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

//	private List<Course> topics = new ArrayList<>(Arrays.asList(
//			new Course("spring", "Spring Framework", "Spring Framework Description"),
//			new Course("java", "Core Java", "Core Java Description"),
//			new Course("javascript", "JavaScript", "JavaScript Description")
//	));

	public List<Topic> getAllTopics() {
		return (List<Topic>) topicRepository.findAll();
//		return  topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("No topic with id " + id));
//		return topics.stream()
//				.filter(topic -> id.equals(topic.getId()))
//				.findFirst()
//				.orElseThrow(() -> new NoSuchElementException("No topic with id " + id));
	}

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(/*String id,*/ Topic topic) {
		topicRepository.save(topic);
//		for(int i = 0; i < topics.size(); i++) {
//			Course t = topics.get(i);
//			if(id.equals(t.getId())) {
//				topics.set(i, topic);
//				return;
//			}
//		}
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
//		topics.removeIf(topic -> id.equals(topic.getId()));
	}
}
