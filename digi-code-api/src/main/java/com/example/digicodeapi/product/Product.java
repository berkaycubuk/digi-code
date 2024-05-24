package com.example.digicodeapi.product;

import com.example.digicodeapi.productComment.ProductComment;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="products")
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ProductComment> productComments;

    private BigDecimal price;

    private Float rating;
}
