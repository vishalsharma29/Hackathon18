package com.cdk.hackathon.customer.assist.dto;

public class RecommendationDto {

    private Integer id;
    private String intent;
    private String customerName;
    private int socialMediaTrends;
    private String customMessage;
    private boolean successResponse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getSocialMediaTrends() {
        return socialMediaTrends;
    }

    public void setSocialMediaTrends(int socialMediaTrends) {
        this.socialMediaTrends = socialMediaTrends;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public boolean isSuccessResponse() {
        return successResponse;
    }

    public void setSuccessResponse(boolean successResponse) {
        this.successResponse = successResponse;
    }

    public RecommendationDto(Integer id, String intent, String customerName, int socialMediaTrends, String customMessage, boolean successResponse) {
        this.id = id;
        this.intent = intent;
        this.customerName = customerName;
        this.socialMediaTrends = socialMediaTrends;
        this.customMessage = customMessage;
        this.successResponse = successResponse;
    }
}
