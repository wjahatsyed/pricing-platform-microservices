package com.adiltech.pricing_platform_microservices.controllers;

import com.adiltech.pricing_platform_microservices.kafka.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    @Autowired
    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/send")
    public String sendMessageToKafka(@RequestParam String message) {
        kafkaProducerService.sendMessage("pricing-topic", message);
        return "Message sent to Kafka: " + message;
    }
}
