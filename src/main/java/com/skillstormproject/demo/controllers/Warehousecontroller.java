package com.skillstormproject.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstormproject.demo.models.Warehouse;
import com.skillstormproject.demo.repos.warehouserepo;

@RestController
public class Warehousecontroller {
    @Autowired
    private warehouserepo repo;

    @GetMapping("/warehouses")
    public List<Warehouse> findallList() {
        return repo.findAll();

    }

    @GetMapping("warehouses/{Id}")
    public Warehouse getWarehouse(int warehouseId) {
        ;
        return repo.getById(warehouseId);

    }
}