package com.cdk.hackathon.customer.assist.entity;

import com.cdk.hackathon.customer.assist.dto.ProductDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductDto toProductView() {
		return new ProductDto(getId(), name);
	}
}
