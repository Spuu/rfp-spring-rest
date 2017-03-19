package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * ListingRepository
 */
public interface ListingRepository extends MongoRepository<Listing, String> {
}
