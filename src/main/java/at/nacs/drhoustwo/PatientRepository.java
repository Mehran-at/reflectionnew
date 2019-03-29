package at.nacs.drhoustwo;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PatientRepository extends MongoRepository<Patient, String> {

    Optional<Patient> findByName(String name);

    Optional<Patient> findBySymptoms(String symptoms);

    Optional<Patient> findByDiagnosis(String diagnosis);

    Optional<Patient> findByTreatment(String treatment);
}
