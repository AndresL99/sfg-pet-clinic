package guro.springframework.sfgpetclinic.repositories;

import guro.springframework.sfgpetclinic.domain.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long>
{
    Owner findByLastName(String lastName);

}
