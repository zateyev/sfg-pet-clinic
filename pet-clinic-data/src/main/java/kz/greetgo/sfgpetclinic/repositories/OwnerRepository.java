package kz.greetgo.sfgpetclinic.repositories;

import kz.greetgo.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
