package com.etiya.recapProject.entities.concretes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")


public class Customer extends ApplicationUser {

	
	@JsonIgnore
	@OneToMany(mappedBy = "customer")
	private List<Rental> rentals;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer")
	private List<CreditCard> creditCards;
}
