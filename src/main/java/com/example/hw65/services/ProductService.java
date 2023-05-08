package com.example.hw65.services;

import com.example.hw65.entity.Product;
import com.example.hw65.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getByName(String name) {
        return productRepository.findProductsByName(name);
    }

    public List<Product> getByPrice(int price) {
        return productRepository.findProductsByPrice(price);
    }

    public List<Product> getByCategory(String category) {
        return productRepository.findProductsByCategory(category);
    }
//    private void Pageable(){
//        int page = 1;
//
//        int count = 3;
//
//        Pageable pageable = PageRequest.of(page, count);
//
//        Page<Product> pagedResult =
//
//                productRepository.findProductsByName(pageable);
//    }

}
