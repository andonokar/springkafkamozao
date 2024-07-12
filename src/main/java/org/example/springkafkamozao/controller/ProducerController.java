package org.example.springkafkamozao.controller;

import org.example.springkafkamozao.dto.MyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProducerController {
    @Autowired
    private KafkaTemplate<Integer, MyDto> kafkaTemplate;

    @PostMapping("/produce")
    public void produce(@RequestBody MyDto message) {
        kafkaTemplate.send("teste", message);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
