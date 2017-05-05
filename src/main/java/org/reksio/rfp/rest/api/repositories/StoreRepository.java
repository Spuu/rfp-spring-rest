package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Store;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * StoreRepository
 */
@RepositoryRestResource
public interface StoreRepository extends MongoRepository<Store, String> {
}
