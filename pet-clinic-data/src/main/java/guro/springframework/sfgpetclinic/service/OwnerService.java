package guro.springframework.sfgpetclinic.service;

import guro.springframework.sfgpetclinic.domain.Owner;

import java.util.Set;

public interface OwnerService
{
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner>findAll();
}
