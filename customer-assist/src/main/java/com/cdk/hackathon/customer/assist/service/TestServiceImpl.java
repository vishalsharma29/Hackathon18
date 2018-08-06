package com.cdk.hackathon.customer.assist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdk.hackathon.customer.assist.dto.DealerDetails;
import com.cdk.hackathon.customer.assist.dto.ProductDto;
import com.cdk.hackathon.customer.assist.entity.Product;
import com.cdk.hackathon.customer.assist.repository.TestRepository;
import com.cdk.hackathon.customer.assist.util.MerchandiseUtil;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestRepository testRepository;

	@Autowired
	private MerchandiseUtil merchandiseUtil;

	@Autowired
	private InventoryStatusHandler inventoryStatusHandler;

	public void create() {
		Product product = new Product();
		product.setName("Mobile");
		testRepository.save(product);
	}

	public ProductDto get(String id) {
		Product product = testRepository.findOne(Integer.parseInt(id));
		if (product != null) {
			return product.toProductView();
		}
		return null;
	}

	public DealerDetails getDealerDetails(String make, String zip) {
		DealerDetails rawDealerDetails = merchandiseUtil.getDealerDetails(make, zip);
		return inventoryStatusHandler.process(rawDealerDetails);
	}
}
