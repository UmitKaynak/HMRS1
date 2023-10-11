package com.project.hmrs_v1.Business.abstracts;


import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {

    DataResult<List<JobPosition>> getAll();
    Result addNewPosition(JobPosition jobPosition);
}
