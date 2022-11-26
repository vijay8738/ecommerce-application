package com.vijaytech.service;

import java.util.List;

import com.vijaytech.entity.Product;

public interface IProductService {

	void createProduct(Product product);

	void updateProduct(Product product);

	void deleteProduct(Integer id);

	Product getProduct(Integer id);

	List<Product> getAllProduct();

}
