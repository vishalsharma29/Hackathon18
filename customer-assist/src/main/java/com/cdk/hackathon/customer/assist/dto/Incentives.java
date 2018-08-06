package com.cdk.hackathon.customer.assist.dto;

public class Incentives {
	private String value;

    private String owner;

    private String displayableValue;

    private String qualified;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDisplayableValue() {
		return displayableValue;
	}

	public void setDisplayableValue(String displayableValue) {
		this.displayableValue = displayableValue;
	}

	public String getQualified() {
		return qualified;
	}

	public void setQualified(String qualified) {
		this.qualified = qualified;
	}

}
