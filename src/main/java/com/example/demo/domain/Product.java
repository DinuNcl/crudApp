package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String brand;
    private String madeIn;
    private Float price;

//    public Product(){
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getMadeIn() {
//        return madeIn;
//    }
//
//    public void setMadeIn(String madeIn) {
//        this.madeIn = madeIn;
//    }
//
//    public Float getPrice() {
//        return price;
//    }
//
//    public void setPrice(Float price) {
//        this.price = price;
//    }
}
