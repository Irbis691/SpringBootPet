package ua.project.pet.repository;

import org.springframework.data.repository.CrudRepository;
import ua.project.pet.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{
}
