package com.credibanco.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.customer.service.ICustomerService;
import com.credibanco.customer.service.dto.CustomerDataResponseDTO;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService serviceCustomer;
	
	
	@GetMapping(value = "/getTestGreet")
	public String getGreet() {
		return "Hello World";
	}
	
	
	@GetMapping(value = "/getcustomer/{id}/name")
	public CustomerDataResponseDTO getById(@PathVariable Integer id) {
		System.out.println("id_______________"+id);
		CustomerDataResponseDTO customerDataResponseDTO = 
				this.serviceCustomer.getCustomerById(id);
		return customerDataResponseDTO;
	}
	

}
