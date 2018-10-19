package amateur.springframework.sfgpetclinic.bootstrap;

import amateur.springframework.sfgpetclinic.model.Owner;
import amateur.springframework.sfgpetclinic.model.Vet;
import amateur.springframework.sfgpetclinic.services.OwnerService;
import amateur.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

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
        owner1.setFirstName("Nikola");
        owner1.setLastName("Jazvec");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Nikolica");
        owner2.setLastName("Prikolica");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ivica");
        vet1.setLastName("Ruski");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ivica");
        vet2.setLastName("Debeji");
        vetService.save(vet2);


    }
}
