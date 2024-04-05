package com.learn.graphqlscalars.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.learn.graphqlscalars.model.Product;
import com.learn.graphqlscalars.repository.ProductRepository;

@Controller
public class ProductController
{
	private final ProductRepository repository;

	public ProductController(ProductRepository repository)
	{
		this.repository = repository;
	}

	@QueryMapping
	public List<Product> allProducts()
	{
		return repository.findAll();
	}
}
