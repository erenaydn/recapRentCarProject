package com.etiya.recapProject.business.abstracts;

import java.util.List;

import com.etiya.recapProject.core.utilities.results.DataResult;
import com.etiya.recapProject.core.utilities.results.Result;
import com.etiya.recapProject.entities.concretes.IndividualCustomer;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.CreateIndividualCustomerRequest;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.DeleteIndividualCustomerRequest;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.UpdateIndividualCustomerRequest;

public interface IndividualCustomerService {
	Result add(CreateIndividualCustomerRequest createIndividualCustomerRequest);

	Result update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest);

	Result delete(DeleteIndividualCustomerRequest deleteIndividualCustomerRequest);

	DataResult<List<IndividualCustomer>> getAll();
}
