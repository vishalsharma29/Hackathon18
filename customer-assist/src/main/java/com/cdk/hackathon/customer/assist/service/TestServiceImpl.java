package com.cdk.hackathon.customer.assist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdk.hackathon.customer.assist.dto.ProductDto;
import com.cdk.hackathon.customer.assist.entity.Product;
import com.cdk.hackathon.customer.assist.repository.TestRepository;

@Service
public class TestService {
	@Autowired
	private TestRepository testRepository;
	
	public void create() {
		Product product = new Product();
		product.setName("Mobile");
		testRepository.save(product);
	}
	
	public ProductDto get(String id) {
		Product product = testRepository.findOne(id);
		if( product != null) {
			return product.toProductView();
		}
		return null;
	}
}
