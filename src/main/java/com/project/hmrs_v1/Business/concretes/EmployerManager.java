package com.project.hmrs_v1.Business.concretes;

import com.project.hmrs_v1.Business.abstracts.EmloyerService;
import com.project.hmrs_v1.Business.abstracts.JobSeekerService;
import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Core.utilities.SuccessDataResult;
import com.project.hmrs_v1.Core.utilities.SuccessResult;
import com.project.hmrs_v1.DataAccess.abstracts.EmployerDao;
import com.project.hmrs_v1.Entities.concretes.Employer;
import com.project.hmrs_v1.Entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmloyerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Employers are listed");
    }

    @Override
    public Result addNewEmployer(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("employer is added successfully");
    }
}
