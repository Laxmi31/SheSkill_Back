package com.SheSkill.SheSkill.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class applications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="application_id")
    private Integer applicationId;
    @JoinColumn(name="job_id")
    private Integer jobId;
    private String status;
    @JoinColumn(name="user_id")
    private String userId;
}
