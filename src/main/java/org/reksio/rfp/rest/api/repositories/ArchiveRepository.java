package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Archive;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * ArchiveRepository
 */
public interface ArchiveRepository extends MongoRepository<Archive, String> {
}
