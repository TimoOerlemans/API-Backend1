package com.example.backendproduct.Product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    List<Product> getAllProductsPerAccount(long id);
    Product saveProduct(Product product);
    void deleteProduct(@PathVariable long id);
    ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product);
    ResponseEntity<Product> getProductById(Long id);
}
