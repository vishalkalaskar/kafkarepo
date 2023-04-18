package com.example.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.consumer.MessageStore;
import com.example.aop.producer.MessageProducer;

@RestController
public class KafkaMsgHandlingController 
{
	@Autowired
	private MessageProducer producer;
	
	@Autowired
	private MessageStore store;
	//http://localhost:8011/send?message=raja
	//http://localhost:8011/send?message=rani
	//http://localhost:8011/send?message=hello
	@GetMapping("/send")
	public String sendMessage(@RequestParam("message") String message)
	{
		String status=producer.sendMessage(message);
		return "<h1>"+status+"</h1>";
	}
	//http://localhost:8011/readAll
	@GetMapping("/readAll")
	public String fecthAllMessage()
	{
		
		return "<h1>"+store.getAllMessages()+"</h1>";
	}

}
