package org.reksio.rfp.rest.api.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Document
 */
@Getter
@Setter
public abstract class Document {

    Document() {
        this.creationDate = LocalDateTime.now();
        this.documentDate = LocalDateTime.now();
        this.lastModificationDate = LocalDateTime.now();
        this.categories = new ArrayList<>();
    }

    @Id
    @Setter(AccessLevel.NONE)
    protected String id;

    @NotNull
    protected String name;

    protected LocalDateTime documentDate;

    protected LocalDateTime creationDate;

    protected LocalDateTime lastModificationDate;

    @DBRef
    protected List<Category> categories;
}
