package com.cdk.hackathon.customer.assist.repository;

import com.cdk.hackathon.customer.assist.entity.SocialMediaTrends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMediaTrends, Integer> {

    @Query( "select count(s.twitterFeeds) from SocialMediaTrends s where s.keyword like %:query%")
    int findTwitterFeedsLike(@Param("query") String query);
}
