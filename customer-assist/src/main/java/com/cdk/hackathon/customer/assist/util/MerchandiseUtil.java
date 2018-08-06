package com.cdk.hackathon.customer.assist.util;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cdk.hackathon.customer.assist.dto.DealerDetails;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Component
public class MerchandiseUtil {
	
	@Value("${token}")
	private String token;

	private static final ObjectMapper objectMapper = new ObjectMapper();
	Logger log = LoggerFactory.getLogger(MerchandiseUtil.class);

	static {
		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	public DealerDetails getDealerDetails(String make, String zip) {
		HttpClient httpclient = HttpClientBuilder.create().build();
		DealerDetails details = null;
		try {

			URIBuilder builder = new URIBuilder(
					"https://api.dit-cfi-pdx.cdk.com/merchandisable-vehicles/v2/vehicles/search");
			builder.setParameter("make", make).setParameter("zip", zip).setParameter("radius", "50").setParameter("offset", "0").setParameter("limit", "100");

			URI uri = builder.build();
			HttpGet getMethod = new HttpGet(uri);
			getMethod.addHeader("Authorization", token);
			HttpResponse response = httpclient.execute(getMethod);
			String responseBody = EntityUtils.toString(response.getEntity(), "UTF-8");
			details = objectMapper.readerFor(DealerDetails.class).readValue(responseBody);
		} catch (Exception e) {
			log.error("Error in calling Merchandise Service", e);
		}
		return details;
	}
}
