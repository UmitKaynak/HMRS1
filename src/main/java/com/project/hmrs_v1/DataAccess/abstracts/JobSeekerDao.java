package com.project.hmrs_v1.DataAccess.abstracts;


import com.project.hmrs_v1.Entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

//    JobSeeker getByCandidateNationalId();
//    JobSeeker getByCandidateName();
//    JobSeeker getByCandidateSurname();
//    JobSeeker getByCandidateBordOfDate_Year();


}
