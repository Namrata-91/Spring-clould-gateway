package com.service1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service1.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
