package com.example.demo.controller;

import com.example.demo.data.dto.ProductDto;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product/{productId}")
    public ProductDto getProduct(@PathVariable String productId){
        return productService.getProduct(productId);
    }

    @PostMapping(value = "/product")
    public ProductDto saveProduct(@RequestBody ProductDto productDto){
        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock = productDto.getProductStock();

        return productService.saveProduct(productId,productName,productPrice,productStock);
    }
}
