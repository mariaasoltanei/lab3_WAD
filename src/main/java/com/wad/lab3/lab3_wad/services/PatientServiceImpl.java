package com.wad.lab3.lab3_wad.services;

import com.wad.lab3.lab3_wad.domain.Patient;
import com.wad.lab3.lab3_wad.repositories.PatientRepository;

import java.util.List;

public class PatientServiceImpl implements PatientService{
    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> findAll() {
        return (List<Patient>) patientRepository.findAll();
    }
}
