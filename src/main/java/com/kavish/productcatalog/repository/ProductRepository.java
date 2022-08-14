package com.kavish.productcatalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kavish.productcatalog.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer> {
    Product findByName(String name);
    List<Product> findByNameContaining(String name);
}
