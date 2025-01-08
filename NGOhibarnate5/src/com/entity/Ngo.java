package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ngo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Breed;
	private float weight;
	private int age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Ngo(int id, String breed, float weight, int age) {
		super();
		Id = id;
		Breed = breed;
		this.weight = weight;
		this.age = age;
	}
	public Ngo() {
		
	}
	@Override
	public String toString() {
		return "Ngo [Id=" + Id + ", Breed=" + Breed + ", weight=" + weight + ", age=" + age + "]";
	}
	
	
	

}
