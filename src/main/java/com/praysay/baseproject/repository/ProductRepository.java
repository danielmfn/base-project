package com.praysay.baseproject.repository;

import com.praysay.baseproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//public interface ProductRepository extends JpaRepository<Product, Integer>, QuerydslPredicateExecutor<Product> {
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
