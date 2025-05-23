package com.services.ms.product.product_service.mapper;

import com.services.ms.product.product_service.model.dto.ProductResponse;
import com.services.ms.product.product_service.model.entity.Product;
import org.mapstruct.Mapper;

//CONVERSION BETWEEN CATEGORY TO CATEGORY RESPONSIVE
@Mapper(componentModel = "spring", uses = CategoryMapper.class)
public interface ProductMapper {

    ProductResponse toProductResponse(Product product);

   
}
