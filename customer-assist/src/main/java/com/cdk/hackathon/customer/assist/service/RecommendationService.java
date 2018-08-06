package com.cdk.hackathon.customer.assist.service;

import com.cdk.hackathon.customer.assist.entity.Recommendation;
import com.cdk.hackathon.customer.assist.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    @Autowired
    RecommendationRepository recommendationRepository;

    public void create(Recommendation recommendation) {
        recommendationRepository.save(recommendation);
    }
}
