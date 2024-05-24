package com.example.digicodeapi.productComment;

import com.example.digicodeapi.product.Product;
import com.example.digicodeapi.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "product_comments")
@Data
public class ProductComment {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne //(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    @JsonBackReference
    //@OnDelete(action = OnDeleteAction.CASCADE)
    private Product product;

    @ManyToOne //(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    //@OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    private String comment;

    private Float rating;

    @CreatedDate
    private Date createdDate;
}
