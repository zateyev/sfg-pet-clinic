package kz.greetgo.sfgpetclinic.repositories;

import kz.greetgo.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisityRepository extends CrudRepository<Visit, Long> {
}
