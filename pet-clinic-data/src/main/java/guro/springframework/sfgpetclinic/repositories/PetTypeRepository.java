package guro.springframework.sfgpetclinic.repositories;

import guro.springframework.sfgpetclinic.domain.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
