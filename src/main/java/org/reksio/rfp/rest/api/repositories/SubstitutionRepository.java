package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Substitution;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * SubstitutionRepository
 */
@RepositoryRestResource
public interface SubstitutionRepository extends MongoRepository<Substitution, String> {
}
