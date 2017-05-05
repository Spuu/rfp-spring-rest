package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * CategoryRepository
 */
@RepositoryRestResource
public interface CategoryRepository extends MongoRepository<Category, String> {
}
