package com.example.product.repositary;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product.model.Product;


public interface ProductRepo extends JpaRepository<Product , Integer>{

}
