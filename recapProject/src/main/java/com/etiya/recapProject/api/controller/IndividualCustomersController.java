package com.etiya.recapProject.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.recapProject.business.abstracts.IndividualCustomerService;
import com.etiya.recapProject.core.utilities.results.DataResult;
import com.etiya.recapProject.core.utilities.results.Result;
import com.etiya.recapProject.entities.concretes.IndividualCustomer;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.CreateIndividualCustomerRequest;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.DeleteIndividualCustomerRequest;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.UpdateIndividualCustomerRequest;

@RestController
@RequestMapping("api/individualcustomers")
public class IndividualCustomersController {
	private IndividualCustomerService customerService;

	@Autowired
	public IndividualCustomersController(IndividualCustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@PostMapping("/add")
	public Result add(@Valid @RequestBody CreateIndividualCustomerRequest createIndividualCustomerRequest) {
		return this.customerService.add(createIndividualCustomerRequest);
	}
	
	@PostMapping("/update")
	public Result update(@Valid @RequestBody UpdateIndividualCustomerRequest updateCustomerRequest) {
		return this.customerService.update(updateCustomerRequest);
	}
	
	@PutMapping("/delete")
	public Result delete(@RequestBody DeleteIndividualCustomerRequest deleteCustomerRequest) {
		return this.customerService.delete(deleteCustomerRequest);
	}
	
	@GetMapping("/getall")
	public DataResult<List<IndividualCustomer>> getAll() {
		return this.customerService.getAll();
	}
}
