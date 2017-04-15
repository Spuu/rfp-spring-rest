package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Counterparty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * CounterpartyRepository
 */
@RepositoryRestResource
public interface CounterpartyRepository extends MongoRepository<Counterparty, String> {
}
