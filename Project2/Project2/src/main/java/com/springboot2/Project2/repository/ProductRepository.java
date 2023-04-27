package com.springboot2.Project2.repository;

import com.springboot2.Project2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

    Product findByName(String name);


}
