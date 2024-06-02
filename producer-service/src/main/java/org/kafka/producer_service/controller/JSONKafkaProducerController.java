package org.kafka.producer_service.controller;

import lombok.AllArgsConstructor;
import org.kafka.producer_service.payload.User;
import org.kafka.producer_service.service.JSONKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/producer")
public class JSONKafkaProducerController {
    private JSONKafkaProducer jsonKafkaProducer;

    @GetMapping("/send")
    ResponseEntity<String> getMessage( @RequestBody User data){
        jsonKafkaProducer.sendMessage(data);
        return ResponseEntity.ok( String.format("JSON message -> %s sent successfully",data.toString()));
    }

}
