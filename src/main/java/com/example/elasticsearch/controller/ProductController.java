package com.example.elasticsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.elasticsearch.entity.Product;
import com.example.elasticsearch.service.ProductService;

@RestController
@RequestMapping("/api/es/products")
public class ProductController {

    @Autowired
    private ProductService  productService;
    
    @GetMapping
    Iterable<Product> findAll(){
       return productService.getProducts();

    }

    @PostMapping
    public Product insertProduct(@RequestBody  Product product){
       return productService.insertProduct(product);
    }

}
