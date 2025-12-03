package com.project.demo;

import org.springframework.data.repository.CrudRepository;

import com.project.demo.Product;

//This creates the product repository

public interface ProductRepository extends CrudRepository<Product, Integer> {

}