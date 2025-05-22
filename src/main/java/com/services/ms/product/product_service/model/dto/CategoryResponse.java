package com.services.ms.product.product_service.model.dto;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryResponse {
    private long id;
    private String name;
}
