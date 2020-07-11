package org.davidwightman.petclinic.repositories;

import org.davidwightman.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}