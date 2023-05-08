package com.example.hw65.repositories;

import com.example.hw65.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
 List<Product> findProductsByName(String name);

 List<Product> findProductsByPrice(int price);

 List<Product> findProductsByCategory(String category);
}
