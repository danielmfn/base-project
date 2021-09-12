package com.praysay.baseproject.service;

import com.praysay.baseproject.model.Product;
import com.praysay.baseproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepositor;

    public List<Product> getProducts() {
        return productRepositor.findAll();
    }

}
