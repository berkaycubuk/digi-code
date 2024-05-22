package com.example.digicodeapi.product;

import com.example.digicodeapi.product.requests.ProductCreateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(
            ProductRepository productRepository
    ) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getOneById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public Product createOne(ProductCreateRequest request) {
        Product product = new Product();
        product.setTitle(request.getTitle());
        product.setDescription(request.getDescription());
        return productRepository.save(product);
    }
}
