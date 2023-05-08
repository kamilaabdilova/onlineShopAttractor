package com.example.hw65.controllers;

import com.example.hw65.entity.Product;
import com.example.hw65.entity.User;
import com.example.hw65.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @GetMapping("/findByName/{name}")
    public ResponseEntity <List<Product>> findByName(@PathVariable String name) {
        return new ResponseEntity<>(productService.getByName(name), HttpStatus.OK);
    }
    @GetMapping("/findByPrice/{price}")
    public ResponseEntity <List<Product>> findByPrice(@PathVariable int price) {
        return new ResponseEntity<>(productService.getByPrice(price), HttpStatus.OK);
    }
    @GetMapping("/findByCategory/{category}")
    public ResponseEntity <List<Product>> findByCategory(@PathVariable String category) {
        return new ResponseEntity<>(productService.getByCategory(category), HttpStatus.OK);
    }
}
