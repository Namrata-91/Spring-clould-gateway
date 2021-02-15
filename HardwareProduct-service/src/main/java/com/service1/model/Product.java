package com.service1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String details;
	private double amount;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDetails() {
		return details;
	}

	public double getAmount() {
		return amount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Product(int id, String name, String details, double amount) {
		this.id = id;
		this.name = name;
		this.details = details;
		this.amount = amount;
	}

	public Product() {
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", details=" + details + ", amount=" + amount + "]";
	}
}
