package com.web.WeMeioPet.ServiceLayer.Customer;

import java.util.List;

import com.web.WeMeioPet.entities.Customer;



public interface CustomerService {
	
	public Customer saveCustomer(Customer product);
    public Customer updateCustomer(Customer product);
    public void deleteCustomer(Customer product);
    public Customer getCustomerById(int id);
    public List<Customer> getAllCustomer();

}
