package com.mipagina.create_product_service.service;

import com.mipagina.create_product_service.model.Product;
import com.mipagina.create_product_service.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }
}
