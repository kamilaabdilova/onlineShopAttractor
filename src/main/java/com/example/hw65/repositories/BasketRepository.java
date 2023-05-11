package com.example.hw65.repositories;

import com.example.hw65.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {
    Basket findBasketByUserId(Long userId);
}
