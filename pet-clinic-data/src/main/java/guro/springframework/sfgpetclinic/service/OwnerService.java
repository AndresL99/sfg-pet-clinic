package guro.springframework.sfgpetclinic.service;

import guro.springframework.sfgpetclinic.domain.Owner;
import org.springframework.beans.factory.annotation.Autowired;


public interface OwnerService extends CrudService<Owner, Long>
{
    Owner findByLastName(String lastName);
}
