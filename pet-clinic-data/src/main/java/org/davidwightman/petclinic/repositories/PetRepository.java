package org.davidwightman.petclinic.repositories;

import org.davidwightman.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
