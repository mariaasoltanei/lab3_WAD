package com.wad.lab3.lab3_wad.repositories;

import com.wad.lab3.lab3_wad.domain.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
