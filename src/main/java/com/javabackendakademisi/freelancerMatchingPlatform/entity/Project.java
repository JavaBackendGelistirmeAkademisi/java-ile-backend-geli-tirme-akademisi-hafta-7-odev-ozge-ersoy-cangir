package com.javabackendakademisi.freelancerMatchingPlatform.entity;

import com.javabackendakademisi.freelancerMatchingPlatform.entity.Bid;
import com.javabackendakademisi.freelancerMatchingPlatform.entity.Category;
import com.javabackendakademisi.freelancerMatchingPlatform.entity.User;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Bid> bids;

    @Column(nullable = false)
    private String status; // "Açık", "Kapalı", "Tamamlandı"

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User employer;

    // Getters and Setters
}