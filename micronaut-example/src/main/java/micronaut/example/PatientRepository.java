package micronaut.example;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
}
