package com.cdk.hackathon.customer.assist.repository;

import com.cdk.hackathon.customer.assist.entity.Adcopy;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Adcopy, Integer> {

    @Query( "select a from Adcopy a where customerName in :customerNames" )
    List<Adcopy> findByCustomerNames(@Param("customerNames") List<String> customerNames, Sort s);
}
