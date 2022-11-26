package com.vijaytech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vijaytech.entity.Product;
import com.vijaytech.repository.ProductRepository;

@Component
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void createProduct(Product product) {
		productRepository.save(product);

	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product getProduct(Integer id) {

		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}

	@Override
	public List<Product> getAllProduct() {

		List<Product> productList = productRepository.findAll();
		return productList;
	}

}
