package com.etiya.recapProject.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdditionalServiceDto {

	private String name;

	private double dailyPrice;

	private String description;
}
