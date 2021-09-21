package com.etiya.recapProject.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.recapProject.business.abstracts.RentalService;
import com.etiya.recapProject.core.utilities.results.DataResult;
import com.etiya.recapProject.core.utilities.results.Result;
import com.etiya.recapProject.entities.concretes.Rental;
import com.etiya.recapProject.entities.requests.RentalRequest.CreateRentalRequest;
import com.etiya.recapProject.entities.requests.RentalRequest.UpdateRentalRequest;

@RestController
@RequestMapping("api/rentals")
public class RentalsController {

	private RentalService rentalService;

	@Autowired
	public RentalsController(RentalService rentalService) {
		super();
		this.rentalService = rentalService;
	}

	@PostMapping("/addIndividiualCustomerRental")
	public Result addIndividualCustomerRental(@Valid @RequestBody CreateRentalRequest createRentalRequest) {
		return this.rentalService.addIndividualCustomerRental(createRentalRequest);
	}

	@PostMapping("/addCorporateCustomerRental")
	public Result addCorporateCustomerRental(@Valid @RequestBody CreateRentalRequest createRentalRequest) {
		return this.rentalService.addCorporateCustomerRental(createRentalRequest);
	}

	@PostMapping("/updateCorporateCustomerRental")
	public Result corporateIndividualCustomerRental(@Valid @RequestBody UpdateRentalRequest updateRentalRequest) {
		return this.rentalService.updateCorporateCustomerRental(updateRentalRequest);
	}

	@PostMapping("/updateIndividiualCustomerRental")
	public Result updateIndividualCustomerRental(@Valid @RequestBody UpdateRentalRequest updateRentalRequest) {
		return this.rentalService.updateIndividualCustomerRental(updateRentalRequest);
	}

	@GetMapping("/getall")
	public DataResult<List<Rental>> getAll() {
		return this.rentalService.getAll();
	}

}
