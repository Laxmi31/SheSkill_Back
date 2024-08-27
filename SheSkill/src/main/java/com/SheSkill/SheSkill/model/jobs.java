package com.SheSkill.SheSkill.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="job_id")
    private Integer jobId;
    private String title;
    private String description;
    @JoinColumn(name="company_name")
    private String companyName;
    private String location;
    @JoinColumn(name="posted_by")
    private String postedBy;
}
