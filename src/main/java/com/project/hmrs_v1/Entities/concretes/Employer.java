package com.project.hmrs_v1.Entities.concretes;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="employer")
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("1")    // jobseeker ve person  olarak ayırt etmek için gidecek bu
public class Employer extends Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="company_id")
    private int id;


    @Column(name="company_name")
    private String companyName;

    @Column(name="company_website")
    private String companyWebsite;


}
