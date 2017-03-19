package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Position;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * PositionRepository
 */
public interface PositionRepository extends MongoRepository<Position, String> {
}
