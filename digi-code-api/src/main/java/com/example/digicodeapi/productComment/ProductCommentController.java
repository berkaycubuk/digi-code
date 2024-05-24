package com.example.digicodeapi.productComment;

import com.example.digicodeapi.productComment.requests.ProductCommentCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/product-comment")
public class ProductCommentController {

    @Autowired
    private ProductCommentService productCommentService;

    @GetMapping("/product/{productId}")
    public Optional<ProductComment> getRelated(@PathVariable Long productId) {
        return productCommentService.getRelated(productId);
    }

    @PostMapping("/create")
    public ProductComment newPostComment(@RequestBody ProductCommentCreateRequest request) {
        return productCommentService.create(request);
    }
}
