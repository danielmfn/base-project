package com.praysay.baseproject.service;

import com.praysay.baseproject.model.Product;
import com.praysay.baseproject.model.QProduct;
import com.praysay.baseproject.repository.ProductRepository;
import com.querydsl.core.BooleanBuilder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    // Uso do Predicate apenas didático, será migrado para uma busca filtrada e nesse será incluído paginação
    public List<Product> getProducts() {
        BooleanBuilder builder = new BooleanBuilder();
        QProduct qProduct = QProduct.product;

        builder.and(qProduct.price.gt(new BigDecimal("3")));

        return builder.getValue() != null ? getProductsFromInterable(builder) : productRepository.findAll();
    }

    private List<Product> getProductsFromInterable(BooleanBuilder builder) {
        assert builder.getValue() != null;
        return StreamSupport.stream(productRepository.findAll(builder.getValue()).spliterator(), false)
                .collect(Collectors.toList());
    }

}
