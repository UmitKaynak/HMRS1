package com.project.hmrs_v1.Entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_seeker")
@Entity
@DiscriminatorValue("2")
public class JobSeeker extends Customer  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="candidate_id")
    private int candidateId;


    @Column(name="candidate_name")
    private String candidateName;


    @Column(name="candidate_surname")
    private String candidateSurname;

    @Column(name="candidate_national_id")
    private String candidateNationalId;


    @Column (name="candidate_bod")
    private Date candidateBordOfDate;


}
