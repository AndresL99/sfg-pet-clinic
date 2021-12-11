package guru.springframework.sfgpetclinic.bootstrap;

import guro.springframework.sfgpetclinic.service.OwnerService;
import guro.springframework.sfgpetclinic.service.PetTypeService;
import guro.springframework.sfgpetclinic.service.SpecialityService;
import guro.springframework.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner
{

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0 ){
            loadData();
        }


    }

    private void loadData()
    {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Bickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("12312321414");

        Pet mikePet = new Pet();
        mikePet.setPetType(saveDogPetType);
        mikePet.setOwner(owner1);
        mikePet.setBirthDate(LocalDate.now());
        mikePet.setName("Rosco");
        owner1.getPets().add(mikePet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Andres");
        owner2.setLastName("Lerner");
        owner2.setAddress("123 Bickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("12312321414");

        Pet fionaCat = new Pet();
        fionaCat.setPetType(saveCatPetType);
        fionaCat.setOwner(owner2);
        fionaCat.setBirthDate(LocalDate.now());
        fionaCat.setName("Just cat");
        owner2.getPets().add(fionaCat);

        ownerService.save(owner1);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Avril");
        vet2.setLastName("Mount");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets.....");
    }

}
