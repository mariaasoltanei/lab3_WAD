package com.wad.lab3.lab3_wad.bootstrap;

import com.wad.lab3.lab3_wad.domain.*;
import com.wad.lab3.lab3_wad.services.CareProviderService;
import com.wad.lab3.lab3_wad.services.PatientService;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

public class DataLoader implements CommandLineRunner {
    private final PatientService patientService;
    private final CareProviderService careProviderService;

    public DataLoader(PatientService patientService, CareProviderService careProviderService) {
        this.patientService = patientService;
        this.careProviderService = careProviderService;
    }

    @Override
    public void run(String... args) throws Exception {
        Patient p1 = new Patient("Jim");
        CareProvider cp1 = new CareProvider("Pam","oncologist");

        HealthIssue hi1 = new HealthIssue("gsgsg");
        HealthService hs1 = new HealthService("jfjfjd", "type");
        Set<HealthService> hsSet = new HashSet<>();
        hsSet.add(hs1);

        MedicalEncounter me1 = new MedicalEncounter(LocalDate.of(2020, Month.JANUARY, 8),p1,cp1,hsSet);

        p1.addHealthIssue(hi1);
        p1.addMedicalEncounter(me1);
        cp1.addMedicalEncounterToCareProvider(me1);

        patientService.save(p1);
        careProviderService.save(cp1);

    }
}
