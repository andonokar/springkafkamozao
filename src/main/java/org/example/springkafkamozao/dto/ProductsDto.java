package org.example.springkafkamozao.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class ProductsDto {
    private String produto;
    private Integer clienteId;
}
