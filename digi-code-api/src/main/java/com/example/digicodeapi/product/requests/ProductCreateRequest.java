package com.example.digicodeapi.product.requests;

import lombok.Data;

@Data
public class ProductCreateRequest {
    Long id;
    String title;
    String description;
}
