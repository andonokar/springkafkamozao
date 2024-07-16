package org.example.springkafkamozao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class EntityTest {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String idade;
    @OneToMany
    private List<Products> products;

}
