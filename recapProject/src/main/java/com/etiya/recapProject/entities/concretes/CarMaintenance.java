package com.etiya.recapProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car_maintenances")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
public class CarMaintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "maintenance_date")
	private Date maintenanceDate;

	@Column(name = "return_date")
	private Date returnDate;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "return_status")
	private boolean returnStatus;

	@ManyToOne
	@JoinColumn(name = "car_id")
	private Car car;
}
