package com.project.hmrs_v1.Business.concretes;

import com.project.hmrs_v1.Business.abstracts.CheckEmployerService;

public class CheckEmployerManager implements CheckEmployerService {


    @Override
    public boolean emailVerification() {
        return true;
    }

    @Override
    public boolean emailConfirmation() {
        return true;
    }

    @Override
    public boolean adminConformation() {
        return true;
    }
}
