package com.cdk.hackathon.customer.assist.service;

import java.util.List;

import com.cdk.hackathon.customer.assist.dto.DealerDetails;

public interface RequestHandler {
	void setNextHandler(RequestHandler handler);
	DealerDetails process(DealerDetails dealerDetails);
	
}
