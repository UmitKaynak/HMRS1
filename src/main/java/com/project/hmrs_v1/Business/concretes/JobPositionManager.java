package com.project.hmrs_v1.Business.concretes;


import com.project.hmrs_v1.Business.abstracts.JobPositionService;
import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Core.utilities.SuccessDataResult;
import com.project.hmrs_v1.Core.utilities.SuccessResult;
import com.project.hmrs_v1.DataAccess.abstracts.JobPositionDao;
import com.project.hmrs_v1.Entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao){
        this.jobPositionDao=jobPositionDao;
    }





    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Job positions are listed.");
    }

    @Override
    public Result addNewPosition(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("job position is added successfully");
    }
}
