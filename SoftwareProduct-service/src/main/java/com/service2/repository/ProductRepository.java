package com.service2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service2.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
