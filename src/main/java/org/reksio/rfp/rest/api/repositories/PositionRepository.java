package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Position;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * PositionRepository
 */
@RepositoryRestResource
public interface PositionRepository extends MongoRepository<Position, String> {
}
