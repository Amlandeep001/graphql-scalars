package com.learn.graphqlscalars.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.learn.graphqlscalars.model.Product;

public interface ProductRepository extends ListCrudRepository<Product, Integer>
{
}
