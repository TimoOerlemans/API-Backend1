package com.example.backendproduct.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/product")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable long id){
        service.deleteProduct(id);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        ResponseEntity<Product> updated  = service.updateProduct(id, product);
        return updated;
    }

    @GetMapping("/products/{id}")
    public List<Product> getAllProductsByAccount(@PathVariable Long id) {
        return service.getAllProductsPerAccount(id);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        return service.getProductById(id);
    }


}
