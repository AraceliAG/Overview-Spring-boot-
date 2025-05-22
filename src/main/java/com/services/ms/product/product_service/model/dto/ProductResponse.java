package com.services.ms.product.product_service.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
@Getter
@Builder
//USUALLY THIS IS USED IN RESPONSE
//@JsonInclude(JsonInclude.Include.NON_NULL) //THIS TO AVOID DATA NULL
//If there not is data, the field is omitted
public class ProductResponse {
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private CategoryResponse category; //This is from class CategoryResponse
    private String status;
}
