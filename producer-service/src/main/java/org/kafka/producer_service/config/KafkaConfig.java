package org.kafka.producer_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("test1").build();
    }

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name("test-topic-2").build();
    }

}
