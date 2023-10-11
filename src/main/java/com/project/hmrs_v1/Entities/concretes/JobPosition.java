package com.project.hmrs_v1.Entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="job_positions")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int jobId;

    @Column(name="position_")
    private String jobPosition;
}
