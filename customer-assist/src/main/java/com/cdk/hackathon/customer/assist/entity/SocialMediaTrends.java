package com.cdk.hackathon.customer.assist.entity;

import com.cdk.hackathon.customer.assist.dto.SocialMediaTrendsDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class SocialMediaTrends {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String keyword;

    @Column
    private int twitterFeeds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getTwitterFeeds() {
        return twitterFeeds;
    }

    public void setTwitterFeeds(int twitterFeeds) {
        this.twitterFeeds = twitterFeeds;
    }

    public SocialMediaTrendsDto toSocialMediaTrendsView() {
        return new SocialMediaTrendsDto(getId(),
                keyword,
                twitterFeeds);
    }
}
