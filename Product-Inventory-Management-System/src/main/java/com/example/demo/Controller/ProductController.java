package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;

@RequestMapping("/Product")
@RestController
public class ProductController {
	
	@Autowired
	private  ProductService productService;
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product)
	{
		return  productService.addProduct(product);
	}
	
	@PostMapping("/addAll")
	public List<Product>  addAllProducts(@RequestBody List<Product> product)
	{
		return productService.addAllProducts(product);
	}
	
	@GetMapping("/{pid}")
	public Optional<Product> getProduct(@PathVariable Integer pid)
	{
		return productService.getProductById(pid);
	}
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	@GetMapping("/isexist/{pid}")
	public boolean productExists(@PathVariable Integer pid)
	{
		 return productService.productExists(pid);
	}
	
	@GetMapping("/count")
	public Long count()	
	{
		return productService.getProductCount();
	}
	
	
	
	@DeleteMapping("/del/{pid}")
	public void deleteProduct(@PathVariable Integer pid)
	{
		productService.deleteProductById(pid);
	}
	
	@GetMapping("/sort")
	public List<Product>  getSortedProducts()
	{
		
		return productService.getSortedProducts();
	}
	
	
	@GetMapping("/page")
	public List<Product> getPaginatedProducts()
	{
		return productService.getPaginatedProducts();
	}
	
	@PutMapping("/{pid}")
	public Product updateProduct(@PathVariable Integer pid,@RequestBody Product product)
	{
		return productService.updateProduct(pid, product);
	}
	
	
	
	

}
