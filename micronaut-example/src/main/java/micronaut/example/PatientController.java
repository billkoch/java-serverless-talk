package micronaut.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

@Controller("/patients")
@RequiredArgsConstructor
public class PatientController {

  private final PatientRepository patientRepository;

  @Get
  public Iterable<Patient> all() {
    return patientRepository.findAll();
  }
}
