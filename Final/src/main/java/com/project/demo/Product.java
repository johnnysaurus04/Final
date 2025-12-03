package com.project.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product { //Represents a product. Used to create table
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id; // Goes up automatically
    private String name;
    private String price;
    private String description;

    // Getters and setters

    public Integer getId() {
        return id;
    };

    public void setId(Integer id) {
        this.id = id;
    };

    public String getName() {
        return name;
    };

    public void setName(String name) {
        this.name = name;
    };

    public String getPrice() {
        return price;
    };

    public void setPrice(String price) {
        this.price = price;
    };

    public String getDescription() {
        return description;
    };

    public void setDescription(String description) {
        this.description = description;
    };
}
