package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public ResponseEntity saveProductDetail(Product prouduct) {

        Product c = new Product();
        try {
            c = productRepo.save(prouduct);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(c, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Optional<Product> getBYID(int productId) {

        return productRepo.findById(productId);
    }

    public List<Product> getPageList(int offset, int size) {

        Page<Product> p =productRepo.findAll(PageRequest.of(offset,size));
        return p.getContent();
    }

    public List<Product> getPageSortList(int offset, int size, String field) {

        Page<Product> p = productRepo.findAll(PageRequest.of(offset, size, Sort.Direction.DESC, field));
        return p.getContent();
    }
}
