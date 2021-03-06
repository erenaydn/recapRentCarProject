package com.etiya.recapProject.entities.requests.carRequest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {

	@JsonIgnore
	private int id;
	
	@NotNull
	private String name;

	@Min(1900)
	private int modelYear;

	@Min(0)
	private double dailyPrice;

	@Size(max = 200)
	private String description;
	
	@NotNull
	private String cityName;
	
	@NotNull
	@Min(0)
	private int currentKilometer;
	
	@Min(0)
	@Max(1900)
	@NotNull
	private int findexPoint;

	@NotNull
	private int brandId;

	@NotNull
	private int colorId;
}
