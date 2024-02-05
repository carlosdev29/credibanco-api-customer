package com.credibanco.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.customer.db.repository.ICustomerRepository;
import com.credibanco.customer.db.repository.entity.CustomerEntity;
import com.credibanco.customer.service.ICustomerService;
import com.credibanco.customer.service.dto.CustomerDataResponseDTO;


@Service
public class CustomerServiceImpl implements ICustomerService{
	
	//private final static Integer ID_CUSTOMER = 100000;
	
	@Autowired
	private ICustomerRepository jpaCustomer;
	
	@Override
	public CustomerDataResponseDTO getCustomerById(Integer id) {
		System.out.println("ids_______________"+id);
		CustomerEntity customerEntity = jpaCustomer.findById(id).orElse(null);
		System.out.println("id_______________"+id);
		CustomerDataResponseDTO customerDataResponseDTO = mapperEntityToDTO(customerEntity);
		return customerDataResponseDTO;
	}
	
	
	public CustomerDataResponseDTO mapperEntityToDTO(CustomerEntity c) {
		CustomerDataResponseDTO customerDataResponseDTO = new CustomerDataResponseDTO();
		customerDataResponseDTO.setId(c.getId());
		customerDataResponseDTO.setName(c.getName());
		customerDataResponseDTO.setLastName(c.getLastName());
		return customerDataResponseDTO;
	} 

}
