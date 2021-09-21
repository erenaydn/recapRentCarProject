package com.etiya.recapProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.recapProject.entities.concretes.CreditCard;
import com.etiya.recapProject.entities.concretes.Customer;

public interface CreditCardDao extends JpaRepository<CreditCard, Integer> {

	Customer getByCustomer_Id(int customerId);

	List<CreditCard> getCreditCardByCustomer_Id(int customerId);
}
