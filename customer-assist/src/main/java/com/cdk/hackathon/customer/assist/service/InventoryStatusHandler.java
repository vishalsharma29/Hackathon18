package com.cdk.hackathon.customer.assist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.cdk.hackathon.customer.assist.dto.DealerDetails;

@Component
public class InventoryStatusHandler implements RequestHandler {
	
	private RequestHandler nextHandler;

	@Autowired
	public InventoryStatusHandler(RequestHandler incentiveStatusHandler) {
		setNextHandler(incentiveStatusHandler);

	}

	@Override
	public DealerDetails process(DealerDetails dealerDetails) {
		dealerDetails.getResults().stream().filter(dealerDetail -> dealerDetail.getInventoryStatus().equalsIgnoreCase("In-stock"));
		if(!CollectionUtils.isEmpty(dealerDetails.getResults())) {
			nextHandler.process(dealerDetails);
		}
		return dealerDetails;
	}

	@Override
	public void setNextHandler(RequestHandler incentiveStatusHandler) {
		this.nextHandler = incentiveStatusHandler;
	}
}
