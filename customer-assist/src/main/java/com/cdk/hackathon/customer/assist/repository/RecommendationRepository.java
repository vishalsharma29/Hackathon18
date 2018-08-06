package com.cdk.hackathon.customer.assist.repository;

import com.cdk.hackathon.customer.assist.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Integer> {

    @Query( "select r from Recommendation r where customerName in :customerName " )
    List<Recommendation> findByCustomerName(@Param("customerName") String customerName);

}
