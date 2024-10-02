package com.javabackendakademisi.freelancerMatchingPlatform.controller;

import com.javabackendakademisi.freelancerMatchingPlatform.entity.Project;
import com.javabackendakademisi.freelancerMatchingPlatform.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        return ResponseEntity.ok(projectService.saveProject(project));
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Project>> getProjectsByCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(projectService.getProjectsByCategory(categoryId));
    }
}
