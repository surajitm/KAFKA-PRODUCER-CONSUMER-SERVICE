package org.kafka.producer_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.Map;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name("test2")
                .partitions(3) //create 3 partition
                .replicas(3) //create 3 replicas
                .configs(Map.of("min.insync.replicas","2")) // confirmation needed atleast from 2 kafka server
                .build();
    }

}
