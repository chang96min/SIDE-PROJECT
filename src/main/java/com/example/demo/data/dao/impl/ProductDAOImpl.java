package com.example.demo.data.dao.impl;

import com.example.demo.data.dao.ProductDAO;
import com.example.demo.data.entity.ProductEntity;
import com.example.demo.data.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {

        return productRepository.getReferenceById(productId);
    }
}
