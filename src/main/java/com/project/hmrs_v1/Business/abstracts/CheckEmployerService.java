package com.project.hmrs_v1.Business.abstracts;

public interface CheckEmployerService {

    boolean emailVerification(); // @email section must same website domoin

    boolean emailConfirmation();

    boolean adminConformation();
}
