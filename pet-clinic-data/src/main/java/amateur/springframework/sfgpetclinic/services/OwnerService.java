package amateur.springframework.sfgpetclinic.services;

import amateur.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
