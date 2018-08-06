package com.cdk.hackathon.customer.assist.service;

import com.cdk.hackathon.customer.assist.dto.RecommendationDto;
import com.cdk.hackathon.customer.assist.entity.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PasoService {
    @Autowired
    private AdService adService;

    @Autowired
    private SocialMediaService socialMediaService;

    @Autowired
    private RecommendationService recommendationService;

    public List<RecommendationDto> getRecommendation(String area, String intent) {
        // get zipcode from area

        // Call Inventory Service using Intent - Search Price / InStock & offers features.

        // Call SocialMediaService
        final int socialMediaTrends = socialMediaService.getSocialMediaTrends(intent);// use make & Model from Inventory response

        // Call Ad Service
        List<Recommendation> recommendations = adService.getRecommendations(intent, socialMediaTrends, getDefaultCustomers()); // User Customer Numbers from Inventory response

        // Save recommendations and return
        recommendations.stream().forEach(myRecommendation -> recommendationService.create(myRecommendation));
        final List<RecommendationDto> recommendationDtos = recommendations.stream().map(myRecommendation -> myRecommendation.toRecommendationView()).collect(Collectors.toList());
        return recommendationDtos;

    }



    private List<String> getDefaultCustomers() {
        List<String> ids = new ArrayList<String>();
        ids.add("My Chevy Dealer");
        ids.add("Peoples Chevy Dealer");
        ids.add("Excel Chevy Dealer");
        return ids;
    }
}
