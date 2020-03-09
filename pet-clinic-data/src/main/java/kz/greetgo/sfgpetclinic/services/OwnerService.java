package kz.greetgo.sfgpetclinic.services;

import kz.greetgo.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

}
