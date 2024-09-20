package com.SheSkill.SheSkill.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class entrepship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer rid;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String type;
    @Column
    private String link;
    @Column
    private Integer posted_by;
}
