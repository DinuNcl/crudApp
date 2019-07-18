//package com.example.demo.Services;
//
//import com.example.demo.ProductRepo;
//import com.example.demo.domain.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//
//    @Autowired
//    private ProductRepo repo;
//
//    public List<Product> listAll(){
//        return repo.findAll();
//    }
//
//    public Product save(Product product){
//        return repo.save(product);
//    }
//
//    public Product get(Long id){
//        return repo.findById(id).orElse(new Product());
//    }
//
//    public void delete(Long id){
//        repo.deleteById(id);
//    }
//
//}
