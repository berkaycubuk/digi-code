package com.example.digicodeapi.product;

import com.example.digicodeapi.product.requests.ProductCreateRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@Validated
public class ProductController {

    private ProductService productService;

    public ProductController(
            ProductService productService
    ) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable Long productId) {
        return productService.getOneById(productId);
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody ProductCreateRequest request) {
        return productService.createOne(request);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        productService.deleteOne(productId);
    }
}
