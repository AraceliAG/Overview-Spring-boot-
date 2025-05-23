package com.services.ms.product.product_service.service;

import com.services.ms.product.product_service.model.dto.CreateProductRequest;
import com.services.ms.product.product_service.model.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponse findById(Long id) {
        return null;
    }

    @Override
    public List<ProductResponse> findAll() {
        return List.of();
    }

    @Override
    public List<ProductResponse> findAllByCategoryId(Long categoryId) {
        return List.of();
    }

    @Override
    public ProductResponse save(CreateProductRequest request) {
        return null;
    }

    @Override
    public ProductResponse update(Long id, CreateProductRequest request) {
        return null;
    }

    @Override
    public void deleteId(Long id) {

    }
}
