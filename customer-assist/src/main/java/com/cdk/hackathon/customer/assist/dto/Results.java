package com.cdk.hackathon.customer.assist.dto;

import java.util.List;

public class Results
{
    private String location;

    private List<Prices> prices;

    private DealerInfo dealerInfo;

	private String promotionAvailable;

    private String displayableWebIdLocale;

    private String year;

    private String category;

    private String vehicleDetailWebUrl;

    private String make;

    private String model;

    private String state;

    private String bodyType;

    private String id;

    private String displayableWebId;

    private String inventoryStatus;
    
    private List<Incentives> incentives;
    
    public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Prices> getPrices() {
		return prices;
	}

	public void setPrices(List<Prices> prices) {
		this.prices = prices;
	}

	public DealerInfo getDealerInfo() {
		return dealerInfo;
	}

	public void setDealerInfo(DealerInfo dealerInfo) {
		this.dealerInfo = dealerInfo;
	}

	public String getPromotionAvailable() {
		return promotionAvailable;
	}

	public void setPromotionAvailable(String promotionAvailable) {
		this.promotionAvailable = promotionAvailable;
	}

	public String getDisplayableWebIdLocale() {
		return displayableWebIdLocale;
	}

	public void setDisplayableWebIdLocale(String displayableWebIdLocale) {
		this.displayableWebIdLocale = displayableWebIdLocale;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getVehicleDetailWebUrl() {
		return vehicleDetailWebUrl;
	}

	public void setVehicleDetailWebUrl(String vehicleDetailWebUrl) {
		this.vehicleDetailWebUrl = vehicleDetailWebUrl;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayableWebId() {
		return displayableWebId;
	}

	public void setDisplayableWebId(String displayableWebId) {
		this.displayableWebId = displayableWebId;
	}

	public String getInventoryStatus() {
		return inventoryStatus;
	}

	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}

	public List<Incentives> getIncentives() {
		return incentives;
	}

	public void setIncentives(List<Incentives> incentives) {
		this.incentives = incentives;
	}
}
			
			
