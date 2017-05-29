package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.models.Category;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentBuilder
 */
@SuppressWarnings("unchecked")
public abstract class DocumentBuilder<T extends DocumentBuilder> {
    String name;
    LocalDateTime creationDate;
    LocalDateTime documentDate;
    LocalDateTime lastModificationDate;
    List<Category> categories;

    DocumentBuilder() {
        this.creationDate = LocalDateTime.now();
        this.documentDate = LocalDateTime.now();
        this.lastModificationDate = LocalDateTime.now();
        this.categories = new ArrayList<>();
    }

    public T setName(String name) {
        this.name = name;
        return (T)this;
    }

    public T setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
        return (T)this;
    }

    public T setDocumentDate(LocalDateTime documentDate) {
        this.documentDate = documentDate;
        return (T)this;
    }

    public T setLastModificationDate(LocalDateTime lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
        return (T)this;
    }

    public T setCategories(List<Category> categories) {
        this.categories = categories;
        return (T)this;
    }
}
