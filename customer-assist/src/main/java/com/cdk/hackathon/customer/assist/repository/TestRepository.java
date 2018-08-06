package com.cdk.hackathon.customer.assist.repository;

import com.cdk.hackathon.customer.assist.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Product, Integer> {
}
