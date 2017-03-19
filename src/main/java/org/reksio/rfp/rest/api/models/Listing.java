package org.reksio.rfp.rest.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * Listing
 */
@Getter
@Setter
public class Listing extends Document {

    public Listing() {}

    @Builder
    public Listing(String name, LocalDate creationDate, LocalDate documentDate, LocalDate lastModificationDate,
                   List<Category> categories, Store store, List<Entry> entries) {
        super(name, creationDate, documentDate, lastModificationDate, categories);
        this.store = store;
        this.entries = entries;
    }

    @DBRef
    @NotNull
    private Store store;

    private List<Entry> entries;

    @Getter
    @Setter
    @Builder
    private static class Entry {
        @DBRef
        private Product product;

        private String ean;

        private Double quantity = 0.0;
    }
}
