package org.davidwightman.petclinic.repositories;

import org.davidwightman.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
