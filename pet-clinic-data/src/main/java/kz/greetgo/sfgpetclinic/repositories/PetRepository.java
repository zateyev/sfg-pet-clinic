package kz.greetgo.sfgpetclinic.repositories;

import kz.greetgo.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
