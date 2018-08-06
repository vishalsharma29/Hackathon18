package com.cdk.hackathon.customer.assist.entity;

import com.cdk.hackathon.customer.assist.dto.AdCopyDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Adcopy {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Long customerNumber;

    @Column
    private String customerName;

    @Column
    private String ad_copy_line_1;

    @Column
    private String ad_copy_line_2;

    @Column
    private String ad_copy_line_3;

    @Column
    private String status;

    @Column
    private Double cost;

    @Column
    private Integer clicks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(final Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }

    public String getAd_copy_line_1() {
        return ad_copy_line_1;
    }

    public void setAd_copy_line_1(final String ad_copy_line_1) {
        this.ad_copy_line_1 = ad_copy_line_1;
    }

    public String getAd_copy_line_2() {
        return ad_copy_line_2;
    }

    public void setAd_copy_line_2(final String ad_copy_line_2) {
        this.ad_copy_line_2 = ad_copy_line_2;
    }

    public String getAd_copy_line_3() {
        return ad_copy_line_3;
    }

    public void setAd_copy_line_3(final String ad_copy_line_3) {
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

    public AdCopyDto toAdcopyView() {
        return new AdCopyDto(getId(),
         customerNumber,
         customerName,
         ad_copy_line_1,
         ad_copy_line_2,
         ad_copy_line_3,
         status,
         cost, clicks);

    }

}
