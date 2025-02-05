package com.mipagina.create_product_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;

import lombok.Data;

@Entity
@Schema(description = "Product entity representing a product in the restaurant menu")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the product", example = "1")
    private Long id_product;

    @Schema(description = "Name of the product", example = "Margherita Pizza", required = true)
    @NotNull(message = "The product name is required")
    @Size(min = 3, max = 50, message = "The name must be between 3 and 50 characters")
    private String name;

    @Schema(description = "Detailed description of the product", example = "Classic Italian pizza with mozzarella, tomato, and basil")
    @NotNull(message = "Description is required")
    @Size(min = 10, max = 200, message = "The description must be between 10 and 200 characters")
    private String description;

    @Schema(description = "Price of the product", example = "12.99", required = true)
    @NotNull(message = "Price is required")
    @Min(value = 0, message = "The price must be greater than or equal to 0")
    private Double price;

    @Schema(description = "Category ID to which the product belongs", example = "2", required = true)
    @NotNull(message = "Category ID is required")
    private Long id_category;

    @Schema(description = "Product availability status", example = "true")
    private Boolean availability;
    // Getters and Setters

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Product() {
    }

    public Product(Long id_product, String name, String description, Double price, Long id_category, Boolean availability) {
        this.id_product = id_product;
        this.name = name;
        this.description = description;
        this.price = price;
        this.id_category = id_category;
        this.availability = availability;
    }
}
