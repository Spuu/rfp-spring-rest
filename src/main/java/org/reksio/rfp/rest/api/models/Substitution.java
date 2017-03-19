package org.reksio.rfp.rest.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * Substitution
 */
@Getter
@Setter
public class Substitution extends Document {

    public Substitution() {}

    @Builder
    public Substitution(String name, LocalDate creationDate, LocalDate documentDate, LocalDate lastModificationDate,
                        List<Category> categories, String description, List<Entry> entries) {
        super(name, creationDate, documentDate, lastModificationDate, categories);
        this.description = description;
        this.entries = entries;
    }

    private String description;
    private List<Entry> entries;

    @Getter
    @Setter
    @Builder
    private static class Entry {
        @DBRef
        @NotNull
        private Position srcPosition;

        @DBRef
        @NotNull
        private Position dstPosition;
    }
}
