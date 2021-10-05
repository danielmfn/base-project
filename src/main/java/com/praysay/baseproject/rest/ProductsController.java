package com.praysay.baseproject.rest;

import com.praysay.baseproject.model.Product;
import com.praysay.baseproject.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@AllArgsConstructor
public class ProductsController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

}
