package com.cdk.hackathon.customer.assist.dto;

public class AdCopyDto {

    private Integer id;

    private Long customerNumber;

    private String customerName;

    private String ad_copy_line_1;

    private String ad_copy_line_2;

    private String ad_copy_line_3;

    private String status;

    private Double cost;

    private Integer clicks;

    public AdCopyDto( final Integer id,
                      final Long customerNumber,
                      final String customerName,
                      final String ad_copy_line_1,
                      final String ad_copy_line_2,
                      final String ad_copy_line_3,
                      final String status,
                      final Double cost, final Integer clicks) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.ad_copy_line_1 = ad_copy_line_1;
        this.ad_copy_line_2 = ad_copy_line_2;
        this.ad_copy_line_3 = ad_copy_line_3;
        this.status = status;
        this.cost = cost;
        this.clicks = clicks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAd_copy_line_1() {
        return ad_copy_line_1;
    }

    public void setAd_copy_line_1(String ad_copy_line_1) {
        this.ad_copy_line_1 = ad_copy_line_1;
    }

    public String getAd_copy_line_2() {
        return ad_copy_line_2;
    }

    public void setAd_copy_line_2(String ad_copy_line_2) {
        this.ad_copy_line_2 = ad_copy_line_2;
    }

    public String getAd_copy_line_3() {
        return ad_copy_line_3;
    }

    public void setAd_copy_line_3(String ad_copy_line_3) {
        this.ad_copy_line_3 = ad_copy_line_3;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }
}
