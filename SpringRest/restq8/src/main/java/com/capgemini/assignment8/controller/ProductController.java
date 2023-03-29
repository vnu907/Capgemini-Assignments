package com.capgemini.assignment8.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.assignment8.product.Product;
import com.capgemini.assignment8.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

	@PostMapping("/product")
	public void addTopic(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@GetMapping("/product/{id}")
	public Optional<Product> getOrder(@PathVariable String id) {
		return productService.addProduct(id);
	}

	@PutMapping("/product/{id}")
	public void updateOrder(@RequestBody Product product, @PathVariable String id) {
		productService.updateProduct(product);
	}

	@DeleteMapping("/product/{id}")
	public void deleteOrder(@PathVariable String id) {
		productService.deleteProduct(id);
	}

}
