package com.mipagina.create_product_service.controller;

import com.mipagina.create_product_service.model.Product;
import com.mipagina.create_product_service.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
            description = "Creates a new product in the system with the provided details",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Product created successfully"),
                    @ApiResponse(responseCode = "400", description = "Invalid product data", content = @Content),
                    @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
            }
    )
    @PostMapping("/products/create")
    public void createProduct(
            @Parameter(
                    description = "Product object that needs to be created",
                    required = true,
                    schema = @Schema(implementation = Product.class)
            )
            @RequestBody Product product
    ) {
        productService.saveProduct(product);
    }
}
