package com.etiya.recapProject.entities.requests.IndividualCustomerRequest;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteIndividualCustomerRequest {
	
	@NotNull
	private String idendityNumber;
	
}
