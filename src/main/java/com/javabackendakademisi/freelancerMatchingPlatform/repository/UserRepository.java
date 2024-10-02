package com.javabackendakademisi.freelancerMatchingPlatform.repository;

import com.javabackendakademisi.freelancerMatchingPlatform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}