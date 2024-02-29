package com.example.product.service;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repositary.ProductRepo;


@Service
public class ProductService {

    private ProductRepo registerRepositary;

    public ProductService(ProductRepo registerRepositary) {
        this.registerRepositary = registerRepositary;
    }

    public ResponseEntity saveRegisterDetail(Product register) {
        Product p = registerRepositary.save(register);
        return new ResponseEntity<>(p,HttpStatus.CREATED);
    }


    public Optional<Product> getByUsername(int id){
        return registerRepositary.findById(id);
    }

    public Product updateRegister(int id, Product product) {
        if (this.getByUsername(id) == null) {
            return new Product();
        }
        try {
            return registerRepositary.save(product);
        } catch (Exception e) {
            return new Product();
        }

    }

    public boolean deleteRegister(int id) {
        if (this.getByUsername(id) == null) {
            return false;
        }
        try {
            registerRepositary.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
