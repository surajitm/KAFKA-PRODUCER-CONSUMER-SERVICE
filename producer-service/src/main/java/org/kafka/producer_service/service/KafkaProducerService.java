package org.kafka.producer_service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String message) {
        LOGGER.info(String.format("Message sent %s", message), topic);
        kafkaTemplate.send("test1", message);
    }


    public void sendMessagePOJO(String topic, String message) {

    }

}
