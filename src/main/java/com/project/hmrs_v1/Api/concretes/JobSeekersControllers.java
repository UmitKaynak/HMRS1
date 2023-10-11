package com.project.hmrs_v1.Api.concretes;

import com.project.hmrs_v1.Business.concretes.JobSeekerManager;
import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class JobSeekersControllers {

    private JobSeekerManager jobSeekerManager;
    @Autowired
    public JobSeekersControllers(JobSeekerManager jobSeekerManager) {
        this.jobSeekerManager = jobSeekerManager;
    }

    @GetMapping(path="api/jobseekers")
    public DataResult<List<JobSeeker>> getAll(){

        return this.jobSeekerManager.getAll();
    }

    @PostMapping(path="addnewjobseeker")
    public Result addToJobSeeker(@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerManager.addNewJobSeeker(jobSeeker);
    }

}
