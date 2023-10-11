package com.project.hmrs_v1.Core.utilities;

public class ErrorResult extends Result{
    public ErrorResult() {
        super(false);
    }


    public ErrorResult(boolean success, String message) {
        super(false, message);
    }
}
