package com.etiya.recapProject.entities.requests.creditCardRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCreditCardRequest {

	private int cardId;

	private int customerId;

}
