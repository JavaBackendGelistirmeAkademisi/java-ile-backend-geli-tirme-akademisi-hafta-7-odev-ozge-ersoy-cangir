package com.javabackendakademisi.freelancerMatchingPlatform.entity;

import com.javabackendakademisi.freelancerMatchingPlatform.entity.Project;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Project> projects;

    // Getters and Setters
}
