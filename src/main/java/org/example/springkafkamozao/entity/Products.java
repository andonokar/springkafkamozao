package org.example.springkafkamozao.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Products {
    @Id
    @GeneratedValue
    private Integer id;
    private String produto;
    @ManyToOne
    private EntityTest entityTest;
}
