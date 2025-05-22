package com.services.ms.product.product_service.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import java.math.BigDecimal;

@Getter
@Builder
public class CreateProductRequest {
    //specific fields that we need to avoid sending all object
    @NotEmpty(message = "The field cannot be empty or null")
    private String name;

    private String description;
    @NotNull(message = "The field price cannot be null ")
    private BigDecimal price;

    @NotNull(message = "The field categoryId cannot be null ")
    private Long categoryId;
}
