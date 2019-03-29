package at.nacs.drhoustwo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientEndpoint {
    private final PatientManager manager;

    @GetMapping
    List<Patient> getAll() {
        return getAll();
    }

    @GetMapping("/patient")
    Patient getName(String name) {
        Optional<Patient> patient = manager.findByName(name);
        return patient.orElse(null);
    }

    @GetMapping("/symptoms")
    Patient getSymptoms(String symptoms) {
        Optional<Patient> patient = manager.findBySymptoms(symptoms);
        return patient.orElse(null);
    }

    @GetMapping("/diagnosis")
    Patient getDiagnosis(String diagnosis) {
        Optional<Patient> patient = manager.findByDiagnosis(diagnosis);
        return patient.orElse(null);
    }

    @GetMapping("/treatment")
        Patient getTreatment(String treatment) {
        Optional<Patient> patient = manager.findByTreatment(treatment);
            return patient.orElse(null);
        }
}
