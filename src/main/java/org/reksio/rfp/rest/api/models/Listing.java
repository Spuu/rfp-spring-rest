package org.reksio.rfp.rest.api.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Listing
 */
@Getter
@Setter
public class Listing extends Document {
    @DBRef
    @NotNull
    private Store store;

    private List<Entry> entries;

    @Getter
    @Setter
    public static class Entry {
        @DBRef
        private Product product;

        private String ean;

        private Double quantity = 0.0;
    }
}
