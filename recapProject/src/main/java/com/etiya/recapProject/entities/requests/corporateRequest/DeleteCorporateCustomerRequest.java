package com.etiya.recapProject.entities.requests.corporateRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCorporateCustomerRequest {

	private String taxNumber;
}
