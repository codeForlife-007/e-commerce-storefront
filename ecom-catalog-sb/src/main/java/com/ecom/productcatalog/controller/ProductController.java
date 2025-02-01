package com.ecom.productcatalog.controller;

import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Product>> getAllProductsByCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(productService.getAllProductsByCategory(categoryId));
    }
}
