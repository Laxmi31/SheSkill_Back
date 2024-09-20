package com.SheSkill.SheSkill.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class applications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="application_id")
    private Integer applicationId;
    @Column(name="job_id")
    private Integer jobId;
    private String status;
    @Column(name="user_id")
    private Integer userId;
}
