package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Position;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * PositionRepository
 */
@RepositoryRestResource
public interface PositionRepository extends MongoRepository<Position, String> {
    // Prevents POST /people and PATCH /people/:id
//    @Override
//    @RestResource(exported = false)
//    Position save(Position position);
//
//    // Prevents DELETE /people/:id
//    @Override
//    @RestResource(exported = false)
//    void delete(Position position);
}
