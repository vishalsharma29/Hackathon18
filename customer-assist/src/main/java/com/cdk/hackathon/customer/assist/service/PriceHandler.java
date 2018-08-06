package com.cdk.hackathon.customer.assist.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cdk.hackathon.customer.assist.dto.DealerDetails;
import com.cdk.hackathon.customer.assist.dto.Results;

@Component
public class PriceHandler implements RequestHandler {

	@Override
	public DealerDetails process(DealerDetails dealerDetails) {
		List<Results> results = dealerDetails.getResults();
		List<Results> resultList = results.stream()
				.filter(result -> !result.getPrices().get(0).getDisplayableValue().equalsIgnoreCase("Contact Us")).collect(Collectors.toList());
		Collections.sort(resultList, Comparator.comparing(PriceHandler::getPriceValue));
		dealerDetails.setResults(resultList);
		int endSize = resultList.size() >= 5 ? 5 : resultList.size();
		dealerDetails.setResults(dealerDetails.getResults().subList(0, endSize));
		return dealerDetails;
	}

	@Override
	public void setNextHandler(RequestHandler handler) {
		// TODO Auto-generated method stub

	}

	private static Double getPriceValue(Results results) {
		return new Double(results.getPrices().get(0).getValue());
	}

}
