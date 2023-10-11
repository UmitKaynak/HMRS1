package com.project.hmrs_v1.Core.utilities;

public class SuccessResult extends Result{

    public SuccessResult() {
    super(true);
    }


    public SuccessResult( String message) {
        super(true, message);
    }

}
