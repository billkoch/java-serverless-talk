package micronaut.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Patient {
  @Id @GeneratedValue private Long id;
  private String lastName;
  private String firstName;
}
