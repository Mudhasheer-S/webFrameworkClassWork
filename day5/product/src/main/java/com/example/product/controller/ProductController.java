package com.example.product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {

    private ProductService registerService;

    public ProductController(ProductService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/api/product")
    public ResponseEntity postMethodName(@RequestBody Product register) {

        return registerService.saveRegisterDetail(register);
    }

    // @GetMapping("/userDatas")
    // public List<Product> getAllDatas() {

    // return registerService.getAllDatas();
    // }

    @PutMapping("/api/product/{productId}")
    public ResponseEntity<Product> putMethodName(@PathVariable int productId, @RequestBody Product product) {
        Product p = registerService.updateRegister(productId, product);
        return new ResponseEntity<>(p, HttpStatus.OK);

    }

    @DeleteMapping("/api/product/{productId}")
    public ResponseEntity<Boolean> delete(@PathVariable int productId) {
        boolean p = registerService.deleteRegister(productId);
        return ResponseEntity.ok(p);

    }

}
