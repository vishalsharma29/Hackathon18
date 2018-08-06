package com.cdk.hackathon.customer.assist.dto;

public class SocialMediaTrendsDto {

    private Integer id;

    private String keyword;

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

    public SocialMediaTrendsDto(Integer id, String keyword, int twitterFeeds) {
        this.id = id;
        this.keyword = keyword;
        this.twitterFeeds = twitterFeeds;
    }
}
