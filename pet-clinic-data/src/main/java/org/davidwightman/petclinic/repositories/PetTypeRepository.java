package org.davidwightman.petclinic.repositories;

import org.davidwightman.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
