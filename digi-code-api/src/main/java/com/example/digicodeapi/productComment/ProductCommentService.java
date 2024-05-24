package com.example.digicodeapi.productComment;

import com.example.digicodeapi.product.ProductService;
import com.example.digicodeapi.productComment.requests.ProductCommentCreateRequest;
import com.example.digicodeapi.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

@Service
public class ProductCommentService {

    @Autowired
    private ProductCommentRepository productCommentRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    public Optional<ProductComment> getRelated(Long productId) {
        return productCommentRepository.findAllByProductId(productId);
    }

    public ProductComment create(ProductCommentCreateRequest request) {
        ProductComment comment = new ProductComment();
        comment.setComment(request.getComment());
        comment.setRating(request.getRating());
        comment.setProduct(productService.getOneById(102L));
        comment.setUser(userService.getOneById(1L));
        comment.setCreatedDate(Date.from(Instant.now()));
        return productCommentRepository.save(comment);
    }
}
