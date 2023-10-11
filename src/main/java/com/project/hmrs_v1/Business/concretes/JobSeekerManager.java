package com.project.hmrs_v1.Business.concretes;

import com.project.hmrs_v1.Business.abstracts.JobSeekerService;
import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Core.utilities.SuccessDataResult;
import com.project.hmrs_v1.Core.utilities.SuccessResult;
import com.project.hmrs_v1.DataAccess.abstracts.JobSeekerDao;
import com.project.hmrs_v1.Entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"JobSeekers are listed");
    }

    @Override
    public Result addNewJobSeeker(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult("job seeker is added successfully");
    }
}
