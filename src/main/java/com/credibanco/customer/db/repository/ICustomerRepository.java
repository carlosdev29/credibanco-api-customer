package com.credibanco.customer.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credibanco.customer.db.repository.entity.CustomerEntity;

@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity, Integer>{

}
