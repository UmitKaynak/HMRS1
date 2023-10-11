package com.project.hmrs_v1.Core.ValidationServices.abstracts;

import com.project.hmrs_v1.Entities.concretes.JobSeeker;

public interface MernisVerificationService {
    boolean isReal(JobSeeker jobSeeker) throws Exception;
}
