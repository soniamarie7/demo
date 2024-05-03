package com.skillstormproject.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstormproject.demo.models.Product;

@RestController
@RequestMapping("/product")
public class Productcontroller {
    @GetMapping
    public Product findallList() {
        return new Product();
    }

}
