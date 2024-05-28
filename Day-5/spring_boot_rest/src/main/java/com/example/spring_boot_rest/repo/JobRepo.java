package com.example.spring_boot_rest.repo;

import com.example.spring_boot_rest.models.JobPost;
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

    public JobPost getJob(int postId) {
        for (JobPost job : jobs) {
            if (job.getPostId() == postId) {
                return job;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost job : jobs) {
            if (job.getPostId() == jobPost.getPostId()) {
                job.setPostId(jobPost.getPostId());
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setReqExperience(jobPost.getReqExperience());
                job.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {
        for (JobPost job : jobs) {
            if (job.getPostId() == postId) {
                jobs.remove(job);
            }
        }
    }
}
