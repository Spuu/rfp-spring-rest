package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * ProductRepository
 */
@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product, String> {
}
