package com.project.hmrs_v1.Business.abstracts;

import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {

    DataResult<List<JobSeeker>> getAll();
    Result addNewJobSeeker(JobSeeker jobSeeker);
}
