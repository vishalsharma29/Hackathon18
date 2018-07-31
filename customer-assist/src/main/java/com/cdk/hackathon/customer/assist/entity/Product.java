package com.cdk.hackathon.customer.assist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cdk.hackathon.customer.assist.dto.ProductDto;

@Table
@Entity
public class Product {

	@Id
	@GeneratedValue
	private String id;

	@Column
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductDto toProductView() {
		return new ProductDto(id, name);
	}
}
