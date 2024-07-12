package org.example.springkafkamozao.service;

import lombok.extern.slf4j.Slf4j;
import org.example.springkafkamozao.dto.MyDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "teste", id = "myGroup")
    public void consume(MyDto message) {
        log.info(message.toString());
        System.out.println("Received message: " + message);
        // Process the message
    }
}