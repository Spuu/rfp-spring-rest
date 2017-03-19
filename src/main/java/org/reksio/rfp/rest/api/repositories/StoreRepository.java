package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * StoreRepository
 */
public interface StoreRepository extends MongoRepository<Store, String> {
}
