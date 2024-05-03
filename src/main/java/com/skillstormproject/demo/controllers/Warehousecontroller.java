package com.skillstormproject.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstormproject.demo.models.Warehouse;

@RestController
public class Warehousecontroller {
    @GetMapping("/warehouses")
    public List<Warehouse> findallList() {
        return null;
    }
}
