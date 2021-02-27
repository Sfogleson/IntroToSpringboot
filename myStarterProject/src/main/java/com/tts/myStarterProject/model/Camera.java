package com.tts.myStarterProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Camera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String brand;
	private String type;
	private String lense;
	
	public Camera() {}

	public Camera(String brand, String type, String lense) {
		this.brand = brand;
		this.type = type;
		this.lense = lense;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLense() {
		return lense;
	}

	public void setLense(String lense) {
		this.lense = lense;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Camera [id=" + id + ", brand=" + brand + ", type=" + type + ", lense=" + lense + "]";
	}
	
}
