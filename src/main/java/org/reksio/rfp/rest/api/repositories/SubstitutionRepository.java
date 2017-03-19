package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Substitution;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * SubstitutionRepository
 */
public interface SubstitutionRepository extends MongoRepository<Substitution, String> {
}
