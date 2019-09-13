package micronaut.example;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;

@TypeHint(
    typeNames = {
      "org.h2.Driver",
      "org.h2.mvstore.db.MVTableEngine",
      "org.hibernate.dialect.H2Dialect"
    })
public class Application {

  public static void main(String[] args) {
    Micronaut.run(Application.class);
  }
}
