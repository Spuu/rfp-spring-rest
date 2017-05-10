package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.models.Category;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentBuilder
 */
@SuppressWarnings("unchecked")
public abstract class DocumentBuilder<T extends DocumentBuilder> {
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

    public T setName(String name) {
        this.name = name;
        return (T)this;
    }

    public T setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return (T)this;
    }

    public T setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
        return (T)this;
    }

    public T setLastModificationDate(LocalDate lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
        return (T)this;
    }

    public T setCategories(List<Category> categories) {
        this.categories = categories;
        return (T)this;
    }
}
