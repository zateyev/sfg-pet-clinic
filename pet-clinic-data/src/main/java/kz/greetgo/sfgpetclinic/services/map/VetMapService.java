package kz.greetgo.sfgpetclinic.services.map;

import kz.greetgo.sfgpetclinic.model.Specialty;
import kz.greetgo.sfgpetclinic.model.Vet;
import kz.greetgo.sfgpetclinic.services.SpecialtyService;
import kz.greetgo.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

  private final SpecialtyService specialtyService;

  public VetMapService(SpecialtyService specialtyService) {
    this.specialtyService = specialtyService;
  }

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

  @Override
  public Vet save(Vet object) {

    if (object.getSpecialties().size() > 0) {
      object.getSpecialties().forEach(specialty -> {
        if (specialty.getId() == null) {
          Specialty savedSpecialty = specialtyService.save(specialty);
          specialty.setId(savedSpecialty.getId());
        }
      });
    }

    return super.save(object);
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }
}
