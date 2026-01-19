package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;


@Controller
@RequestMapping("Customer")
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/{customerId}")
	public Customer getCustomer(@PathVariable Integer customerId)
	{
		return customerService.getCustomerById(customerId);
	}
	
	@PutMapping("Update/{customerId}")
	public Customer updateCustomer(@PathVariable Integer customerId, @RequestBody Customer customer) {
		
		
		return customerService.updateCustomer(customerId,customer);
	}
	
	@DeleteMapping("/{customerId}")
	public void deleteCustomer(@PathVariable Integer customerId)
	{
		 customerService.deleteCustomer(customerId);
	}
	
	
	
}
