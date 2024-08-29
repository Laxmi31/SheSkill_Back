package com.SheSkill.SheSkill.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class entrepreneurship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rid;
    private String title;
    private String description;
    private String type;
    private String link;
    private String posted_by;
}
