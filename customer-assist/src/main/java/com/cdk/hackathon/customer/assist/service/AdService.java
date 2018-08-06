package com.cdk.hackathon.customer.assist.service;

import com.cdk.hackathon.customer.assist.dto.AdCopyDto;
import com.cdk.hackathon.customer.assist.entity.Adcopy;
import com.cdk.hackathon.customer.assist.entity.Recommendation;
import com.cdk.hackathon.customer.assist.repository.AdRepository;
import com.cdk.hackathon.customer.assist.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class AdService {

    static AtomicInteger id = new AtomicInteger(0);
    @Autowired
    private AdRepository adRepository;

    @Autowired
    private RecommendationRepository recommendationRepository;



    public List<Recommendation> getRecommendations(String intent, int socialMediaTrends, List<String> customerNames) {

        List<Recommendation> recommendations = new ArrayList<>();
        final Optional<String> recommendedCustomerNameByAdClicks = getAd(customerNames);
        if(recommendedCustomerNameByAdClicks.isPresent()) {
            recommendations.add(createRecommendation(intent, recommendedCustomerNameByAdClicks.get(), socialMediaTrends, "Recommended By AdClicks"));
        }

        String recommendedCustomerNameBySocialMedia = "";
        int successResponse = 0;
        for(String customerName : customerNames) {
            final List<Recommendation> byCustomerName = recommendationRepository.findByCustomerName(customerName);
            final List<Recommendation> recommendationList = byCustomerName.stream().filter(c -> c.isSuccessResponse()).collect(Collectors.toList());
            if ( recommendationList.size() > successResponse ) {
                recommendedCustomerNameBySocialMedia = customerName;
                successResponse = recommendations.size();
            }
        }
        recommendations.add(createRecommendation(intent, recommendedCustomerNameBySocialMedia, socialMediaTrends, "Recommended By Social Media Trends"));
        return recommendations;
    }

    private Optional<String> getAd(List<String> customerNames) {
        final List<Adcopy> adcopies = adRepository.findByCustomerNames(customerNames, new Sort(Sort.Direction.DESC, "clicks"));
        final List<AdCopyDto> adCopyDtos = adcopies.stream().map(a -> a.toAdcopyView()).collect(Collectors.toList());

        return Optional.of(adCopyDtos.get(0).getCustomerName());
    }

    private Recommendation createRecommendation( String intent,
                                                 String customerName,
                                                 int socialMediaTrends,
                                                 String customMessage) {
        Recommendation recommendation = new Recommendation();
        // recommendation.setId(id.incrementAndGet());
        recommendation.setCustomerName(customerName);
        recommendation.setIntent(intent);
        recommendation.setSocialMediaTrends(socialMediaTrends);
        recommendation.setCustomMessage(customMessage);

        return recommendation;
    }

}
