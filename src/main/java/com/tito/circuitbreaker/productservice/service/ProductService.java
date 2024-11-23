package com.tito.circuitbreaker.productservice.service;

import com.tito.circuitbreaker.productservice.dto.ProductRequest;
import com.tito.circuitbreaker.productservice.dto.ProductResponse;
import com.tito.circuitbreaker.productservice.models.Product;

import java.util.List;

/**
 * Author: Titus Murithi Bundi
 * Date:11/23/24
 */
public interface ProductService {
    ProductResponse createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
