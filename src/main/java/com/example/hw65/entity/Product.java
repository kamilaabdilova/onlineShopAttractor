package com.example.hw65.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 128)
    private String name;
    @Column(name = "description", length = 128)
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "imageUrl", length = 128)
    private String imageUrl;
    @Column(name = "quantity")
    private int quantity;


    //добисать
    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "comment")
    private String comment;
}
