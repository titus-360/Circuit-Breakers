package com.tito.circuitbreaker.productservice.repositories;

import com.tito.circuitbreaker.productservice.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Titus Murithi Bundi
 * Date:11/23/24
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
