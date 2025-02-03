package com.mipagina.create_product_service.controller;

import com.mipagina.create_product_service.model.Product;
import com.mipagina.create_product_service.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Product", description = "Product creation API")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Operation(
            summary = "Create a new product",
            description = "Creates a new product in the system with the provided details"
    )
    @PostMapping("/products/create")
    public void createProduct(
            @Parameter(description = "Product object that needs to be created")
            @RequestBody Product product
    ) {
        productService.saveProduct(product);
    }
}