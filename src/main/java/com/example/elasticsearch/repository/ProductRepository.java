package com.example.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.elasticsearch.entity.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {

}