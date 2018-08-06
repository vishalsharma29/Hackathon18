package com.cdk.hackathon.customer.assist.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.cdk.hackathon.customer.assist.dto.DealerDetails;
import com.cdk.hackathon.customer.assist.dto.Results;

@Component
public class IncentiveStatusHandler implements RequestHandler {

	private RequestHandler nextHandler;

	@Autowired
	public IncentiveStatusHandler(RequestHandler priceHandler) {
		setNextHandler(priceHandler);
	}

	@Override
	public void setNextHandler(RequestHandler priceHandler) {
		this.nextHandler = priceHandler;
	}

	@Override
	public DealerDetails process(DealerDetails dealerDetails) {
		 List<Results> streamResults = dealerDetails.getResults().stream().filter(dealerDetail -> {
			if (!CollectionUtils.isEmpty(dealerDetail.getIncentives())) {
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		if (streamResults.size() >= 5) {
			dealerDetails.setResults(streamResults);
		}
		return nextHandler.process(dealerDetails);
	}
}
