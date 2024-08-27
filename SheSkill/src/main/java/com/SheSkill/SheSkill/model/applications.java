package com.SheSkill.SheSkill.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class applications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="job_id")
    private Integer jobId;
    @JoinColumn(name="application_id")
    private String applicationId;
    private String status;
    @JoinColumn(name="user_id")
    private String userId;
}
