package com.example.digicodeapi.productComment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductCommentRepository extends JpaRepository<ProductComment, Long> {

    Optional<ProductComment> findAllByProductId(Long productId);
}
