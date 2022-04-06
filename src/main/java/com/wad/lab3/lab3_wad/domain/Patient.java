package com.wad.lab3.lab3_wad.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"healthIssues, medicalEncounters"})
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<HealthIssue> healthIssues = new HashSet<>();

    @OneToMany(mappedBy = "patient", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<MedicalEncounter> medicalEncounters = new HashSet<>();

    public Patient(String name) {
        this.name = name;
    }

    public void addHealthIssue(HealthIssue healthIssue){
        this.getHealthIssues().add(healthIssue);
    }

    public void addMedicalEncounter(MedicalEncounter medicalEncounter){
        this.getMedicalEncounters().add(medicalEncounter);
        medicalEncounter.setPatient(this);
    }
}
