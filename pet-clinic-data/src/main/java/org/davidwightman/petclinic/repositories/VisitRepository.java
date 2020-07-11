package org.davidwightman.petclinic.repositories;

import org.davidwightman.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
