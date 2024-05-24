package com.example.digicodeapi.product.requests;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductCreateRequest {
    Long id;
    String title;
    String description;
    BigDecimal price;
    Float rating;
}
