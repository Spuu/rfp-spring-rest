package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * ListingRepository
 */
@RepositoryRestResource
public interface ListingRepository extends MongoRepository<Listing, String> {
}
