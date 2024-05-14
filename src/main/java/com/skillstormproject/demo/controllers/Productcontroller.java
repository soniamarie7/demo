package com.skillstormproject.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstormproject.demo.models.Product;
import com.skillstormproject.demo.repos.productrepo;

import jakarta.persistence.Id;

@RestController
@RequestMapping("/product")
public class Productcontroller {
@Autowired productrepo repo;

   
   
@GetMapping

    public Product findallList() {
        return new Product();
    } 
@PostMapping
public Product saveProduct(Product item) {
    return repo.save(item); }
@PutMapping({"/Id"})
public Product replaceProduct(Product item) {
    return repo.save(item);}
    @DeleteMapping
    public void updateProduct(Product item) {
        repo.delete(item);

        
        @GetMapping("Product/{Id});"
}
