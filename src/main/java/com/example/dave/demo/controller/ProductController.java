package com.example.dave.demo.controller;

import com.example.dave.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
                new Product(1L, "Laptop", 999.99),
                new Product(2L, "Keyboard", 79.99),
                new Product(3L, "Mouse", 39.99)
        );
    }
    @GetMapping("/products/{id}")
public Product getProductById(@PathVariable Long id) {
    return new Product(id, "Laptop", 999.99);
}

@PostMapping("/products")
public Product createProduct(@RequestBody Product product) {
    return product;
}
}