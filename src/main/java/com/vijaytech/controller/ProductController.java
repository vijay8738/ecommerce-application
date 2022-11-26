package com.vijaytech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vijaytech.entity.Product;
import com.vijaytech.service.IProductService;


@CrossOrigin
@RestController
@RequestMapping("/v1")
public class ProductController {

	@Autowired
	IProductService productService;

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Product> getProduct(Integer id) {
		Product product = productService.getProduct(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);

	}

	@RequestMapping(value = "/product", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Product>> getAllProduct() {

		List<Product> productList = productService.getAllProduct();
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);

	}

	//@RequestMapping(value = "/product", method = RequestMethod.POST,
	//		produces = "application/json" , consumes = "application/json")
	@PostMapping("/product")
	public ResponseEntity createProduct(@RequestBody Product product) {

		productService.createProduct(product);

		return new ResponseEntity<>("Product inserted successfully", HttpStatus.OK);

	}

	@RequestMapping(value = "/product", method = RequestMethod.PUT,
			produces = "application/json")
	public ResponseEntity updateProduct(@RequestBody Product p) {
		productService.updateProduct(p);

		return new ResponseEntity<>("Product updated successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/product", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity deleteProduct(Integer id) {

		productService.deleteProduct(id);
		return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);

	}
}
