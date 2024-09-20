package com.SheSkill.SheSkill.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
    private Integer jobId;
    private String title;
    private String description;
    @Column(name="company_name")
    private String companyName;
    private String location;
    @Column(name="posted_by")
    private String postedBy;
}
