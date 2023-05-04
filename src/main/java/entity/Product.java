package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 128)
    private String name;
    @Column(length = 128)
    private String description;
    @Column
    private int price;
    @Column(length = 128)
    private String imageUrl;
    @Column
    private int quantity;
}
