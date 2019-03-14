package io.ivan.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = Arrays.asList(
			new Topic("spring","spring Framework","Spring Framewro description"),
			new Topic("java","Core Java","Core Java Description"),
			new Topic("javascript","JavaScript","JavaScript Description")
			);

	public List<Topic> getAllTopics(){
		return topics;
	}
}