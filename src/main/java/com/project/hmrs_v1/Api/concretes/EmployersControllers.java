package com.project.hmrs_v1.Api.concretes;


import com.project.hmrs_v1.Business.concretes.EmployerManager;
import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployersControllers {

    private EmployerManager employerManager;

    @Autowired
    public EmployersControllers(EmployerManager employerManager) {
        this.employerManager = employerManager;
    }

    @GetMapping(path="api/employers")
    public DataResult<List<Employer>> getAll(){
        return this.employerManager.getAll();
    }
    @PostMapping(path="addnewemployer")
    public Result addNewEmployer(@RequestBody  Employer employer){
        return this.employerManager.addNewEmployer(employer);
    }

}
