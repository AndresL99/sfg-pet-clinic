package guru.springframework.sfgpetclinic.bootstrap;

import guro.springframework.sfgpetclinic.domain.Owner;
import guro.springframework.sfgpetclinic.domain.Vet;
import guro.springframework.sfgpetclinic.service.OwnerService;
import guro.springframework.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Andres");
        owner2.setLastName("Lerner");

        ownerService.save(owner1);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Avril");
        vet2.setLastName("Mount");

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }

}
