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
public class CreateRentalRequest {

	@NotNull
	private Date rentDate;

	@NotNull
	private int carId;

	@NotNull
	private int customerId;

	@NotNull
	@Min(0)
	private int startKilometer;

	@NotNull
	private String pickUpLocation;

	@NotNull
	private String dropOffLocation;

}