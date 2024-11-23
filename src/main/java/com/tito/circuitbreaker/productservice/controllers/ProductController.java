package com.tito.circuitbreaker.productservice.controllers;

import com.tito.circuitbreaker.productservice.dto.ProductRequest;
import com.tito.circuitbreaker.productservice.dto.ProductResponse;
import com.tito.circuitbreaker.productservice.models.Product;
import com.tito.circuitbreaker.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Titus Murithi Bundi
 * Date:11/23/24
 */
@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
