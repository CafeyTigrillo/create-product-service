package com.mipagina.create_product_service.repository;

import com.mipagina.create_product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {

}
