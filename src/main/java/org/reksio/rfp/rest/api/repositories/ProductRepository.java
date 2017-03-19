package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * ProductRepository
 */
public interface ProductRepository extends MongoRepository<Product, String> {
}
