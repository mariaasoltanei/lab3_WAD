package com.wad.lab3.lab3_wad.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor

//patient,careprovider repo
public class CareProvider {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String specialty;

    public CareProvider(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<MedicalEncounter> medicalEncounters = new HashSet<>();

    public void addMedicalEncounterToCareProvider(MedicalEncounter medicalEncounter){
        this.getMedicalEncounters().add(medicalEncounter);
        medicalEncounter.setCareProvider(this);
    }
}
