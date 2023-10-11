package com.project.hmrs_v1.Business.concretes;

import com.project.hmrs_v1.Business.abstracts.CheckJobSeekerService;
import com.project.hmrs_v1.Core.ValidationServices.abstracts.MernisVerificationService;

public class CheckJobSeekerManager implements CheckJobSeekerService {

    private MernisVerificationService mernisVerificationService;




    @Override
    public boolean mernisVerification(String jobSeekerId, String jobSeekerName, String jobSeekerSurname, String jobSeekerBornOfDate) {
        return true;
    }

    @Override
    public boolean emailconfirmation() {
        return true;//should be false when develop the this section
    }
}
