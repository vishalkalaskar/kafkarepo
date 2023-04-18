package com.example.aop.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer 
{
	@Autowired
	private KafkaTemplate<String,String> template;
	
	@Value("${app.topic.name}")
	private String topicname;
	
	public String sendMessage(String message)
	{
		template.send(topicname,message);
		return "message delivered";
	}

}
