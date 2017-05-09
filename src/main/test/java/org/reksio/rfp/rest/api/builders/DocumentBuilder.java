package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.models.Category;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentBuilder
 */
public abstract class DocumentBuilder {
    String name;
    LocalDate creationDate;
    LocalDate documentDate;
    LocalDate lastModificationDate;
    List<Category> categories;

    DocumentBuilder() {
        this.creationDate = LocalDate.now();
        this.documentDate = LocalDate.now();
        this.lastModificationDate = LocalDate.now();
        this.categories = new ArrayList<>();
    }

    public DocumentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DocumentBuilder setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public DocumentBuilder setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
        return this;
    }

    public DocumentBuilder setLastModificationDate(LocalDate lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
        return this;
    }

    public DocumentBuilder setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }
}
