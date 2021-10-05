package com.praysay.baseproject.service;

import com.praysay.baseproject.model.Product;
import com.praysay.baseproject.model.QProduct;
import com.praysay.baseproject.repository.ProductRepository;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        BooleanBuilder builder = new BooleanBuilder();
        QProduct qProduct = QProduct.product;

//        builder.and(qProduct.price. > new BigDecimal("3"));

        return productRepository.findAll();
    }

}
