package com.example.dave.demo.service;

import com.example.dave.demo.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return List.of(
                new Product(1L, "Laptop", 999.99),
                new Product(2L, "Keyboard", 79.99),
                new Product(3L, "Mouse", 39.99)
        );
    }

    public Product getProductById(Long id) {

        if (id == 1) {
            return new Product(1L, "Laptop", 999.99);
        }

        if (id == 2) {
            return new Product(2L, "Keyboard", 79.99);
        }

        if (id == 3) {
            return new Product(3L, "Mouse", 39.99);
        }

        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Product not found"
        );
    }

    public Product createProduct(Product product) {
    return product;
}
}