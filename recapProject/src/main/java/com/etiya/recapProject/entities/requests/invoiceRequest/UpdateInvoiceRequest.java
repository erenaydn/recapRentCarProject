package com.etiya.recapProject.entities.requests.invoiceRequest;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInvoiceRequest {
	
	@NotNull
	private int id;
	
	@NotNull
	private String invoiceNumber;
	
	@NotNull
	private Date invoiceDate;
	
	@NotNull
	private Date rentalDate;
	
	@NotNull
	private Date rentalReturnDate;
	
	@NotNull
	private Long totalRentalDay;
	
	@NotNull
	private Double amount;
	
	@NotNull
	private int rentalId;
	
	@NotNull
	private int customerId;
}
