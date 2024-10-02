package com.javabackendakademisi.freelancerMatchingPlatform.repository;

import com.javabackendakademisi.freelancerMatchingPlatform.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
