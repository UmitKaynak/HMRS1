package com.project.hmrs_v1.DataAccess.abstracts;

import com.project.hmrs_v1.Entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
