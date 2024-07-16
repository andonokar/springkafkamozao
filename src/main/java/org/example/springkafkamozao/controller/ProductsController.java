package org.example.springkafkamozao.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import org.example.springkafkamozao.dto.ProductsDto;
import org.example.springkafkamozao.entity.Products;
import org.example.springkafkamozao.repository.EntityTestRepository;
import org.example.springkafkamozao.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    EntityTestRepository entityTestRepository;

    @PostMapping
    public Products create(@RequestBody ProductsDto products) {
        var entity = entityTestRepository.findById(products.getClienteId());
        if (entity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "A entidade com ID nao existe: " + products.getClienteId());
        }
        var produto = new Products();
        produto.setProduto(products.getProduto());
        produto.setEntityTest(entity.get());
        return productsRepository.save(produto);
    }
}
