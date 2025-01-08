package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fitness {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private float weight;
	private String address;
	private long mobileno;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Fitness(int id, String name, float weight, String address, long mobileno) {
		super();
		Id = id;
		this.name = name;
		this.weight = weight;
		this.address = address;
		this.mobileno = mobileno;
	}
	public Fitness() {
		
	}
	
	@Override
	public String toString() {
		return "Fitness [Id=" + Id + ", name=" + name + ", weight=" + weight + ", address=" + address + ", mobileno="
				+ mobileno + "]";
	}
	
	
	
	

}
