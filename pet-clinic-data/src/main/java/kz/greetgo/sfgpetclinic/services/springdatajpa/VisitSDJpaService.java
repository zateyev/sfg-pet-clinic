package kz.greetgo.sfgpetclinic.services.springdatajpa;

import kz.greetgo.sfgpetclinic.model.Visit;
import kz.greetgo.sfgpetclinic.repositories.VisityRepository;
import kz.greetgo.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

  private final VisityRepository visityRepository;

  public VisitSDJpaService(VisityRepository visityRepository) {
    this.visityRepository = visityRepository;
  }

  @Override
  public Set<Visit> findAll() {
    Set<Visit> visits = new HashSet<>();
    visityRepository.findAll().forEach(visits::add);
    return visits;
  }

  @Override
  public Visit findById(Long aLong) {
    return visityRepository.findById(aLong).orElse(null);
  }

  @Override
  public Visit save(Visit object) {
    return visityRepository.save(object);
  }

  @Override
  public void delete(Visit object) {
    visityRepository.delete(object);
  }

  @Override
  public void deleteById(Long aLong) {
    visityRepository.deleteById(aLong);
  }
}
