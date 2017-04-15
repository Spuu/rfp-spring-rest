package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Archive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * ArchiveRepository
 */
@RepositoryRestResource
public interface ArchiveRepository extends MongoRepository<Archive, String> {
}
