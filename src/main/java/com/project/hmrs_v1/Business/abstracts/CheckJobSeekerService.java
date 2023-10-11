package com.project.hmrs_v1.Business.abstracts;

public interface CheckJobSeekerService {

    boolean mernisVerification(String jobSeekerId,String jobSeekerName,String jobSeekerSurname,String jobSeekerBornOfDate);
    boolean emailconfirmation();
}
