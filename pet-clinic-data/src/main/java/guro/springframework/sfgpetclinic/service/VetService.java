package guro.springframework.sfgpetclinic.service;

import guro.springframework.sfgpetclinic.domain.Vet;

import java.util.Set;

public interface VetService
{
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
