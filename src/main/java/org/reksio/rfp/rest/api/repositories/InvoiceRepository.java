package org.reksio.rfp.rest.api.repositories;

import org.reksio.rfp.rest.api.models.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface InvoiceRepository extends MongoRepository<Invoice, String> {
	List<Invoice> findByName(@Param("name") String name);
}

