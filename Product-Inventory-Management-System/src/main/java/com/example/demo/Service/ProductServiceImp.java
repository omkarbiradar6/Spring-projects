package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> addAllProducts(List<Product> product) {
		// TODO Auto-generated method stub
		return productRepository.saveAll(product);
	}

	@Override
	public Optional<Product> getProductById(Integer pid) {
		
		return productRepository.findById(pid);
	}

	@Override
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}

	@Override
	public boolean productExists(Integer pid) {
		// TODO Auto-generated method stub
		return productRepository.existsById(pid);
	}

	@Override
	public Long getProductCount() {
		// TODO Auto-generated method stub
		return productRepository.count();
	}

	@Override
	public void deleteProductById(Integer pid) {
		// TODO Auto-generated method stub
		productRepository.deleteById(pid);
		
	}

	@Override	
	public List<Product> getSortedProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll( Sort.by("name"));
	}

	@Override
	public List<Product> getPaginatedProducts() {
		// TODO Auto-generated method stub
		  Page<Product> page =  productRepository.findAll(PageRequest.of(0, 9));
		  return page.getContent();
	}

	@Override
	public Product updateProduct(Integer pid,Product pro) {
		// TODO Auto-generated method stub
		Product existing= productRepository.findById(pid).orElse(null);
		if(existing!=null)
		{
			existing.setName(pro.getName());
			existing.setCategory(pro.getCategory());
			existing.setPrice(pro.getPrice());
			existing.setQuantity(pro.getQuantity());
			existing.setStatus(pro.getStatus());
			
		}
		return null;
	}

}
