package com.mipagina.create_product_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Schema(description = "Product entity representing a menu item in the restaurant system")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the menu item", example = "1")
    private Long id_product;

    @Schema(description = "Name of the menu item", example = "Grilled Chicken Sandwich")
    private String name;

    @Schema(description = "Description of the menu item", example = "Grilled chicken with lettuce, tomato, and mayo on toasted bread")
    private String description;

    @Schema(description = "Price of the menu item", example = "12.99")
    private Double price;

    @Schema(description = "Category ID to which the menu item belongs (e.g., main dish, appetizer)", example = "2")
    private Long id_category;

    @Schema(description = "Availability of the menu item (if available in the restaurant)", example = "true")
    private Boolean availability;

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
