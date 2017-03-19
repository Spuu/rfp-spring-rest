package org.reksio.rfp.rest.api.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * Document
 */
@Getter
@Setter
public abstract class Document {

    public Document() {
    }

    public Document(String name, LocalDate creationDate, LocalDate documentDate, LocalDate lastModificationDate, List<Category> categories) {
        this.name = name;
        this.creationDate = creationDate;
        this.documentDate = documentDate;
        this.lastModificationDate = lastModificationDate;
        this.categories = categories;
    }

    @Id
    @Setter(AccessLevel.NONE)
    protected String id;

    @NotNull
    protected String name;

    protected LocalDate creationDate = LocalDate.now();

    protected LocalDate documentDate = LocalDate.now();

    protected LocalDate lastModificationDate = LocalDate.now();

    @DBRef
    protected List<Category> categories;
}
