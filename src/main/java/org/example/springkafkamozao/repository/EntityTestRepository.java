package org.example.springkafkamozao.repository;

import org.example.springkafkamozao.entity.EntityTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityTestRepository extends JpaRepository<EntityTest, Integer> {
}
