package guru.springframework.sfgpetclinic.bootstrap;

import guro.springframework.sfgpetclinic.domain.Owner;
import guro.springframework.sfgpetclinic.domain.PetType;
import guro.springframework.sfgpetclinic.domain.Vet;
import guro.springframework.sfgpetclinic.service.OwnerService;
import guro.springframework.sfgpetclinic.service.PetTypeService;
import guro.springframework.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Andres");
        owner2.setLastName("Lerner");

        ownerService.save(owner1);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Avril");
        vet2.setLastName("Mount");

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }

}
