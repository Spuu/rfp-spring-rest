package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * ProductRepository
 */
@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product, String> {
    @RestResource(path = "nameOrEan", rel = "nameOrEan")
    Page<Product> findByNameIgnoreCaseContainingOrEanIgnoreCaseContaining(@Param("name") String name, @Param("ean") String ean, Pageable pageable);
}
