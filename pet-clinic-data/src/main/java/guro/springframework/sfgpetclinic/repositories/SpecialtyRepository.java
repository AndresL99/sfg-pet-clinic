package guro.springframework.sfgpetclinic.repositories;

import guro.springframework.sfgpetclinic.domain.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
