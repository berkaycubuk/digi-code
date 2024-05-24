package com.example.digicodeapi.productComment.requests;

import lombok.Data;

@Data
public class ProductCommentCreateRequest {
    Long id;
    Long productId;
    Long userId;
    String comment;
    Float rating;
}
