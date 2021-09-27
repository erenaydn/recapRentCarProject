package com.etiya.recapProject.entities.requests.rentalRequest;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRentalRequest {

	@NotNull
	private int id;
	
	@NotNull
	private Date rentDate;
	
	private Date returnDate;
	
	@Min(0)
	@NotNull
	private int startKilometer;
	
	@Min(0)
	@NotNull
	private int endKilometer;
	
	@NotNull
	private String pickUpLocation;
	
	@NotNull
	private String dropOffLocation;
	
	@NotNull
	private int carId;
	
	@NotNull
	private int customerId;
	
	private boolean rentStatus;
}