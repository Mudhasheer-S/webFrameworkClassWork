package com.example.product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductController {

    private ProductService ProductService;

    public ProductController(ProductService productService) {
        this.ProductService = productService;
    }

    @PostMapping("/api/product")
    public ResponseEntity postMethodName(@RequestBody Product prouduct) {

        return ProductService.saveProductDetail(prouduct);
    }

    @GetMapping("/api/product/{productId}")
    public Optional<Product> getMethodName(@PathVariable("productId") int productId) {
        return ProductService.getBYID(productId);
    }

    @GetMapping("/api/product/{offset}/{pagesize}")
    public List<Product> getMethodName(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize) {
        return ProductService.getPageList(offset, pagesize);
    }

    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public List<Product> getMethodName(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize,
            @PathVariable("field") String field) {

        return ProductService.getPageSortList(offset, pagesize, field);
    }

}
