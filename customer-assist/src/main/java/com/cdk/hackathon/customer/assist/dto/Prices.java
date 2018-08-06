package com.cdk.hackathon.customer.assist.dto;

public class Prices {
	private String defaultIncluded;

	private String value;

	private String priceType;

	private String label;

	private String featured;

	private String displayableValue;

	public String getDefaultIncluded() {
		return defaultIncluded;
	}

	public void setDefaultIncluded(String defaultIncluded) {
		this.defaultIncluded = defaultIncluded;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getFeatured() {
		return featured;
	}

	public void setFeatured(String featured) {
		this.featured = featured;
	}

	public String getDisplayableValue() {
		return displayableValue;
	}

	public void setDisplayableValue(String displayableValue) {
		this.displayableValue = displayableValue;
	}
}
