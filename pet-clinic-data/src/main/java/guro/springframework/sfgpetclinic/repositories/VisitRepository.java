package guro.springframework.sfgpetclinic.repositories;

import guro.springframework.sfgpetclinic.domain.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
