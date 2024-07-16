package org.example.springkafkamozao.controller;

import org.example.springkafkamozao.entity.EntityTest;
import org.example.springkafkamozao.repository.EntityTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entity")
public class EntityController {
    @Autowired
    EntityTestRepository entityTestRepository;

    @PostMapping
    public EntityTest save(@RequestBody EntityTest entityTest) {
        return entityTestRepository.save(entityTest);
    }

}
