package com.example.digicodeapi.product;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Lob
    @Column(columnDefinition = "text")
    private String description;
}
