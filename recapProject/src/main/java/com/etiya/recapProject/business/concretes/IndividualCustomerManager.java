package com.etiya.recapProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.recapProject.business.abstracts.IndividualCustomerService;
import com.etiya.recapProject.business.constants.Messages;
import com.etiya.recapProject.core.utilities.results.DataResult;
import com.etiya.recapProject.core.utilities.results.Result;
import com.etiya.recapProject.core.utilities.results.SuccessDataResult;
import com.etiya.recapProject.core.utilities.results.SuccessResult;
import com.etiya.recapProject.dataAccess.abstracts.IndividualCustomerDao;
import com.etiya.recapProject.entities.concretes.IndividualCustomer;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.CreateIndividualCustomerRequest;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.DeleteIndividualCustomerRequest;
import com.etiya.recapProject.entities.requests.IndividualCustomerRequest.UpdateIndividualCustomerRequest;

@Service
public class IndividualCustomerManager implements IndividualCustomerService {

	@Autowired
	private IndividualCustomerDao individualCustomerDao;

	public IndividualCustomerManager(IndividualCustomerDao individualCustomerDao) {
		super();
		this.individualCustomerDao = individualCustomerDao;
	}

	@Override
	public Result add(CreateIndividualCustomerRequest createIndividualCustomerRequest) {

		IndividualCustomer individualCustomer = new IndividualCustomer();
// first name identity gelecek
		individualCustomer.setFirstName(createIndividualCustomerRequest.getFirstName());
		individualCustomer.setLastName(createIndividualCustomerRequest.getLastName());
		individualCustomer.setEmail(createIndividualCustomerRequest.getEmail());
		individualCustomer.setPassword(createIndividualCustomerRequest.getPassword());
		individualCustomer.setIdentityNumber(createIndividualCustomerRequest.getIdendityNumber());
		this.individualCustomerDao.save(individualCustomer);
		return new SuccessResult(Messages.CUSTOMERADD);
	}

	@Override
	public Result update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
		IndividualCustomer individualCustomer = this.individualCustomerDao
				.getByIdentityNumber(updateIndividualCustomerRequest.getIdendityNumber());
		individualCustomer.setId(updateIndividualCustomerRequest.getId());

		individualCustomer.setFirstName(updateIndividualCustomerRequest.getFirstName());
		individualCustomer.setLastName(updateIndividualCustomerRequest.getLastName());
		individualCustomer.setEmail(updateIndividualCustomerRequest.getEmail());
		individualCustomer.setPassword(updateIndividualCustomerRequest.getPassword());
		individualCustomer.setIdentityNumber(updateIndividualCustomerRequest.getIdentityNumber());
		this.individualCustomerDao.save(individualCustomer);
		return new SuccessResult(Messages.CUSTOMERUPDATE);
	}

	@Override
	public Result delete(DeleteIndividualCustomerRequest deleteCustomerRequest) {
		IndividualCustomer customer = new IndividualCustomer();
		customer.setId(
				this.individualCustomerDao.getByIdentityNumber(deleteCustomerRequest.getIdendityNumber()).getId());

		this.individualCustomerDao.deleteById(customer.getId());
		return new SuccessResult(Messages.CUSTOMERDELETE);
	}

	@Override
	public DataResult<List<IndividualCustomer>> getAll() {
		return new SuccessDataResult<List<IndividualCustomer>>(this.individualCustomerDao.findAll(),
				Messages.CUSTOMERLIST);
	}

}
