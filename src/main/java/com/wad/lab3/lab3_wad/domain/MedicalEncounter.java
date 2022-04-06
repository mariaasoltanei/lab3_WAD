package com.wad.lab3.lab3_wad.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class MedicalEncounter {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;

    public MedicalEncounter(LocalDate date, Patient patient, CareProvider careProvider, Set<HealthService> healthServices) {
        this.date = date;
        this.patient = patient;
        this.careProvider = careProvider;
        this.healthServices = healthServices;
    }

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private CareProvider careProvider;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<HealthService> healthServices = new HashSet<>();

    public void addHealthService(HealthService healthService){
        this.getHealthServices().add(healthService);
        healthService.setMedicalEncounter(this);
    }

}
