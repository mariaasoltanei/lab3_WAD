package com.wad.lab3.lab3_wad.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class HealthService {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String type;

    public HealthService(String description, String type) {
        this.description = description;
        this.type = type;
    }

    @ManyToOne
    private MedicalEncounter medicalEncounter;
}
