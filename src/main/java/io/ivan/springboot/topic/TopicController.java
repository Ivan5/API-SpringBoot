package io.ivan.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return Arrays.asList(
				new Topic("spring","spring Framework","Spring Framewro description"),
				new Topic("java","Core Java","Core Java Description"),
				new Topic("javascript","JavaScript","JavaScript Description")
				);
				
	}
}
