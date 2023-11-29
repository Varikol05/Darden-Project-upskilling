package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.User;
import com.example.publisher.RabbitMqJsonProducer;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {
     
	@Autowired
	private RabbitMqJsonProducer jsonProducer;
	
	public MessageJsonController(RabbitMqJsonProducer jsonProducer) {
		this.jsonProducer=jsonProducer;
	}
	
	
	@PostMapping("/publish")
	public ResponseEntity<String> sendJsonMessage(@RequestBody User user){
	jsonProducer.sendJsonMessage(user);
	return ResponseEntity.ok("Json message send to Rabbit Mq....");
	}
}
