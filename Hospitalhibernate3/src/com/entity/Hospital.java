package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	private String name;
	private String disease;
	private long amount;
	
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	public Hospital(int patientId, String name, String disease, long amount) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.disease = disease;
		this.amount = amount;
	}
	public Hospital() {
		
	}
	@Override
	public String toString() {
		return "Hospital [patientId=" + patientId + ", name=" + name + ", disease=" + disease + ", amount=" + amount
				+ "]";
	}
	
	
	
	
	
	
	
}
