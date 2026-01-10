package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;

@Service
public interface ProductService {

	Product addProduct(Product product);
	List<Product> addAllProducts(List<Product> products);
	Optional<Product> getProductById(Integer pid);
	List<Product> getAllProducts();
	boolean productExists(Integer pid);
	Long getProductCount();
	void deleteProductById(Integer pid);
	List<Product> getSortedProducts();
	List<Product> getPaginatedProducts();
	Product updateProduct(Integer pid,Product product);
	
	
}
