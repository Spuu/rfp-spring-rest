package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Counterparty;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * CounterpartyRepository
 */
public interface CounterpartyRepository extends MongoRepository<Counterparty, String> {
}
