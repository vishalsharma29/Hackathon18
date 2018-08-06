package com.cdk.hackathon.customer.assist.service;

import com.cdk.hackathon.customer.assist.dto.ProductDto;
import com.cdk.hackathon.customer.assist.entity.Product;
import com.cdk.hackathon.customer.assist.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private AdRepository adRepository;
	
	public void create() {
		Product product = new Product();
		product.setName("Mobile");
		// entityRepository.save(product);
	}
	
	public ProductDto get(String id) {
		/*Product product = (Product) entityRepository.findOne(Integer.parseInt(id));
		if( product != null) {
			return product.toProductView();
		}*/
		return null;
	}


}
