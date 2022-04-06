package com.wad.lab3.lab3_wad.services;

import com.wad.lab3.lab3_wad.domain.Patient;

import java.util.List;

public interface PatientService {
    Patient save(Patient patient);
    List<Patient> findAll();
}
