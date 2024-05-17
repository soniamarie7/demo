package com.skillstormproject.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstormproject.demo.models.Product;
import com.skillstormproject.demo.repos.productrepo;

@RestController
@RequestMapping("/product")
public class Productcontroller {
    @Autowired
    productrepo repo;

    @GetMapping

    public List<Product> findallList() {
        return repo.findAll();
    
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product item) {
        return repo.save(item);
    }

    @PutMapping("/{Id}")
    public Product replaceProduct(@RequestBody Product item) {
        return repo.save(item);
    }

    @DeleteMapping("/{id}")
    public void deletetbyId(@PathVariable ("id") int Id) {
        repo.deleteById(Id);
    }

    @GetMapping("/{id}")
    public Optional<Product> GetbyId(@PathVariable ("id") int Id) {
        return repo.findById(Id);

    }
}
