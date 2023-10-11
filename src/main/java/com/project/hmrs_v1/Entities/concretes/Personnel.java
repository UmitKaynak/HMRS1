package com.project.hmrs_v1.Entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="personnel")
@Entity
@DiscriminatorValue("3")
public class Personnel extends Customer  {

    @Id
    @Column(name="personnel_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personelID; //customer id işaret et

    @Column(name="personnel_name")
    private String personnelName;

    @Column(name="personnel_surname")
    private String personelSurname;


}
