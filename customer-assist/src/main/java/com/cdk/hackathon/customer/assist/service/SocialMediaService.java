package com.cdk.hackathon.customer.assist.service;

import com.cdk.hackathon.customer.assist.entity.SocialMediaTrends;
import com.cdk.hackathon.customer.assist.repository.SocialMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SocialMediaService {


    @Autowired
    TwitterService twitterService;

    @Autowired
    private SocialMediaRepository socialMediaRepository;

    public void computeAndSaveSocialMediaTrend(final String query) {
        final int positiveTwitterTrends = twitterService.shouldFindPostiveSentiments(query);
        SocialMediaTrends socialMediaTrends = new SocialMediaTrends();
        socialMediaTrends.setKeyword(query);
        socialMediaTrends.setTwitterFeeds(positiveTwitterTrends);
        socialMediaRepository.save(socialMediaTrends);
    }

    public int getSocialMediaTrends(final String query) {
        computeAndSaveSocialMediaTrend(query);
        return socialMediaRepository.findTwitterFeedsLike(query);
    }

}
