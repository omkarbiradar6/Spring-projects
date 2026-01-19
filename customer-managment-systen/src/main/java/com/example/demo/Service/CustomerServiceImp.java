package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired CustomerRepository customerRepository;
	
	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}

	@Override
	public Customer updateCustomer(Integer customerId, Customer customer) {
		 Customer isPresent=customerRepository.findById(customerId).orElse(null);
		 
		 if(isPresent!=null)
		 {
			 isPresent.setCustomerName(customer.getCustomerName());
			 isPresent.setCustomerStatus(customer.getCustomerStatus());
			 return customerRepository.save(isPresent);
		 }
		 
		 return null;
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		 customerRepository.deleteById(customerId);
	}

}
