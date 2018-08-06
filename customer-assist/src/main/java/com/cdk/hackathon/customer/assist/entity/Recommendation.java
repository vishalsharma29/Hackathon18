package com.cdk.hackathon.customer.assist.entity;

import com.cdk.hackathon.customer.assist.dto.RecommendationDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Recommendation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String intent;

    @Column
    private String customerName;

    @Column
    private int socialMediaTrends;

    @Column
    private String customMessage;

    @Column
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

    public RecommendationDto toRecommendationView() {
        return new RecommendationDto(id, intent,customerName, socialMediaTrends, customMessage, successResponse);
    }
}
