package com.example.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.dto.User;

@Service
public class RabbitMqJsonProducer {
	
	@Value("${rabbitmq.exchange.name}")
	private String exchange;
	
	@Value("${rabbitmq.routing.json.key}")
	private String routingJsonKey;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMqJsonProducer.class);
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	
	public RabbitMqJsonProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate=rabbitTemplate;
	}
	
	public void sendJsonMessage(User user) {
		LOGGER.info(String.format("json message sent -> %s",  user.toString()));
	rabbitTemplate.convertAndSend(exchange, routingJsonKey, user);
	}
	

}
