package org.reksio.rfp.rest.api.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Document
 */
@Getter
@Setter
public abstract class Document {

    public Document() {
        this.creationDate = LocalDate.now();
        this.documentDate = LocalDate.now();
        this.lastModificationDate = LocalDate.now();
        this.categories = new ArrayList<>();
    }

    @Id
    @Setter(AccessLevel.NONE)
    protected String id;

    @NotNull
    protected String name;

    protected LocalDate creationDate;

    protected LocalDate documentDate;

    protected LocalDate lastModificationDate;

    @DBRef
    protected List<Category> categories;
}
