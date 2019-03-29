package at.nacs.drhoustwo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class PatientManager {

    private final PatientRepository repository;

    public Optional<Patient> findByName(String name) {
        return repository.findByName(name);
    };

    public Optional<Patient> findBySymptoms(String symptoms) {
        return repository.findBySymptoms(symptoms);
    };

    public Optional<Patient> findByDiagnosis(String diagnosis) {
        return repository.findByDiagnosis(diagnosis);
    };

    public Optional<Patient> findByTreatment(String treatment) {
        return repository.findByTreatment(treatment);
    };


}
