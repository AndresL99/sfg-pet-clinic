package guro.springframework.sfgpetclinic.repositories;

import guro.springframework.sfgpetclinic.domain.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long>
{

}
