package com.project.hmrs_v1.DataAccess.abstracts;

import com.project.hmrs_v1.Entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
    
}
