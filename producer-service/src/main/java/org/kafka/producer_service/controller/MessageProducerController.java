package org.kafka.producer_service.controller;


import org.kafka.producer_service.service.KafkaProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/kafka")
public class MessageProducerController {
    private KafkaProducerService kafkaProducerService;
    public MessageProducerController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService  = kafkaProducerService;
    }


    @GetMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
        kafkaProducerService.sendMessage("kafka_topic1",message);
        return ResponseEntity.ok(message);
    }

}
