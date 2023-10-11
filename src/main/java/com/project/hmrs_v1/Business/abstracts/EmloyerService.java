package com.project.hmrs_v1.Business.abstracts;

import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Entities.concretes.Employer;

import java.util.List;

public interface EmloyerService {

    DataResult<List<Employer>> getAll();
    Result addNewEmployer(Employer employer);
}
