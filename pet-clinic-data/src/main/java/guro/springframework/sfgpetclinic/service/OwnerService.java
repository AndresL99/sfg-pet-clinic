package guro.springframework.sfgpetclinic.service;

import guro.springframework.sfgpetclinic.domain.Owner;

public interface OwnerService extends CrudService<Owner, Long>
{
    Owner findByLastName(String lastName);
}
