package com.cdk.hackathon.customer.assist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdk.hackathon.customer.assist.entity.Product;

@Repository
public interface TestRepository extends JpaRepository<Product, String> {

}
