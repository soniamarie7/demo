package com.skillstormproject.demo.models;

import jakarta.persistence.Entity;

@Entity
public class Product {
private int idproduct;
private String type;
private String brand;
private int warehouseId;
public int getIdproduct() {
    return idproduct;
}
public void setIdproduct(int idproduct) {
    this.idproduct = idproduct;
}
public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public String getBrand() {
    return brand;
}
public void setBrand(String brand) {
    this.brand = brand;
}
public int getWarehouseId() {
    return warehouseId;
}
public void setWarehouseId(int warehouseId) {
    this.warehouseId = warehouseId;
}
@Override
public String toString() {
    return "Product [idproduct=" + idproduct + ", type=" + type + ", brand=" + brand + ", warehouseId=" + warehouseId
            + "]";
}


}
