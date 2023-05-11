package com.example.hw65.entity;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "reviews")
@Data
@RequiredArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "username")
    private String username;

    @Column(name = "time")
    private Timestamp time;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
