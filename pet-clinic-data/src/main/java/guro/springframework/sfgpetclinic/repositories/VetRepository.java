package guro.springframework.sfgpetclinic.repositories;

import guro.springframework.sfgpetclinic.domain.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
