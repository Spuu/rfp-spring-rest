package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * CategoryRepository
 */
public interface CategoryRepository extends MongoRepository<Category, String> {
}
