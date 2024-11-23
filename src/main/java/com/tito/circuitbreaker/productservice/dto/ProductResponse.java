package com.tito.circuitbreaker.productservice.dto;

import java.math.BigDecimal;

/**
 * Author: Titus Murithi Bundi
 * Date:11/23/24
 */
public record ProductResponse(
        String id,
        String name,
        String description,
        BigDecimal price
) {
}
