package com.example.hw65.entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name" ,length = 128)
    private String name;
    @Column (name="description", length = 128)
    private String description;
    @Column(name = "price", length = 128)
    private int price;
    @Column(name = "imageUrl", length = 128)
    private String imageUrl;
    @Column
    private int quantity;
}
