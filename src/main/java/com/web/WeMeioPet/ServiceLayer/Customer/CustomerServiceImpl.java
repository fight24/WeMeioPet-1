package com.web.WeMeioPet.ServiceLayer.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.WeMeioPet.entities.Customer;
import com.web.WeMeioPet.repository.CustomerRepository;
import com.web.WeMeioPet.security.SpringSecurity;


@Service

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customeRepo ;
	private SpringSecurity springSecurity = new SpringSecurity();
	@Override
	public Customer saveCustomer(Customer customer) {
		String encodedPassword = springSecurity.passwordEncode(customer.getPassword());
		customer.setPassword("*".repeat(encodedPassword.length()));
		 return customeRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customeRepo.save(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customeRepo.delete(customer);
	}

	@Override
	public Customer getCustomerById(int id) {

		return customeRepo.findById(id).get();
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customeRepo.findAll();
		 
	}

}
