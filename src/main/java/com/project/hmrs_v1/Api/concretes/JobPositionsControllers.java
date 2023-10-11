package com.project.hmrs_v1.Api.concretes;


import com.project.hmrs_v1.Business.abstracts.JobPositionService;
import com.project.hmrs_v1.Core.utilities.DataResult;
import com.project.hmrs_v1.Core.utilities.Result;
import com.project.hmrs_v1.Entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class JobPositionsControllers {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsControllers(JobPositionService jobPositionService){
        this.jobPositionService=jobPositionService;
    }

    @GetMapping(path="api/positions")
    public DataResult<List<JobPosition>> getAll(){
        return this.jobPositionService.getAll();
    }

    @PostMapping(path="api/addnewpostion")
    public Result addToPosition(@RequestBody JobPosition jobPosition){
        return this.jobPositionService.addNewPosition(jobPosition);
    }


}
