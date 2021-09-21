package com.etiya.recapProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.recapProject.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	boolean existsCustomerByEmail(String email);
}
