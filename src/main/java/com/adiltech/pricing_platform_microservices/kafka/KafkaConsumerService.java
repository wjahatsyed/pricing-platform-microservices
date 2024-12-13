package com.adiltech.pricing_platform_microservices.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "pricing-topic", groupId = "pricing-group")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
