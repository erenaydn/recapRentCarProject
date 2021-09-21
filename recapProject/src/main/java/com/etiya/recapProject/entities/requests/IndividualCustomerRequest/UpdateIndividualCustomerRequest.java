package com.etiya.recapProject.entities.requests.IndividualCustomerRequest;

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
public class UpdateIndividualCustomerRequest {
	
	private int id;
	
	@NotNull
	private String firstName;

	@NotNull
	private String lastName;

	@NotNull
	private String idendityNumber;

	@NotNull
	@NotBlank
	private String email;

	@NotNull
	@NotBlank
	private String password;

	private String identityNumber;
}
