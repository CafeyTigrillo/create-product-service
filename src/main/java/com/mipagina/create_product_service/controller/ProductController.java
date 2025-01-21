package com.mipagina.create_product_service.controller;

import com.mipagina.create_product_service.model.Product;
import com.mipagina.create_product_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping("/products/create")
    public void createProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

}
