package com.example.springapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Product;
import com.example.springapp.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo rep;

    public boolean post(Product person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<String> start(String value)
    {
        List<Product> l = rep.findByProductNameStartingWith(value);
        List<String> updateValue = new ArrayList<>();

        for(Product product : l){
            updateValue.add(product.getProductName());
        }

        return updateValue;
    }

    public List<Product> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<Product> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
