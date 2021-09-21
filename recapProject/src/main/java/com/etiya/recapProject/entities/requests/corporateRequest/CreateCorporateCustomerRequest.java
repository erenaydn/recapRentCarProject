package com.etiya.recapProject.entities.requests.corporateRequest;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCorporateCustomerRequest {

	private String taxNumber;
	
	private String companyName;
	
	@NotNull
	@NotBlank
	private String email;

	@NotNull
	@NotBlank
	private String password;
}
