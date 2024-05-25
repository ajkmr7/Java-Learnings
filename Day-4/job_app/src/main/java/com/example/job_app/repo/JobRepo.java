package com.example.job_app.repo;

import com.example.job_app.models.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "iOS Developer", "sasasasas sasasasas sasasasas", 1, List.of("Swift", "iOS", "CocoaPods", "SwiftUI")),
            new JobPost(2, "Java Developer", "sasasasas sasasasas sasasasas", 1, List.of("Java", "Springboot")),
            new JobPost(3, "Android Developer", "sasasasas sasasasas sasasasas", 1, List.of("Java", "Android", "Compose", "Kotlin"))
    ));

    public List<JobPost> getAllJobs() {

        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
    }
}
