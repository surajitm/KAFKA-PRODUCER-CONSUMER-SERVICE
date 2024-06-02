package org.kafka.consumer_service.service;


import org.kafka.producer_service.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "test-topic-2",groupId = "mygroup")
    public void consume(User data) {
        LOGGER.info(String.format("Message received: %s", data.toString()));
        LOGGER.info("First Name: " + data.getFirstName());
        LOGGER.info("Last Name: " + data.getLastName());
        LOGGER.info("Email: " + data.getEmail());
    }

}