package com.cdk.hackathon.customer.assist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.hackathon.customer.assist.dto.ProductDto;
import com.cdk.hackathon.customer.assist.service.ProductService;

@RestController
public class ProductController {
@Autowired
private ProductService productService;
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create() {
		productService.create();
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public ProductDto get(@PathVariable("id") String id) {
		return productService.get(id);
	}

}
