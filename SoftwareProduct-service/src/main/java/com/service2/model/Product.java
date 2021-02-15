package com.service2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "softwareproduct")
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String details;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDetails() {
		return details;
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
	public Product(int id, String name, String details) {
		this.id = id;
		this.name = name;
		this.details = details;
	}
	public Product() {
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", details=" + details + "]";
	}
}
