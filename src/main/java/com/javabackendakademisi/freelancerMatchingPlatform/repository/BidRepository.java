package com.javabackendakademisi.freelancerMatchingPlatform.repository;

import com.javabackendakademisi.freelancerMatchingPlatform.entity.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends JpaRepository<Bid, Long> {
}