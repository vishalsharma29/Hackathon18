package com.cdk.hackathon.customer.assist.service;

import com.cdk.hackathon.customer.assist.dto.DealerDetails;
import com.cdk.hackathon.customer.assist.dto.ProductDto;

public interface TestService {
	
	public void create();
	
	public ProductDto get(String id);

	public DealerDetails getDealerDetails(String make, String zip) ;
}
