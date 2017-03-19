package org.reksio.rfp.rest.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Archive
 */
@Getter
@Setter
public class Archive {

    public Archive() {}

    @Builder
    public Archive(Product product, Store store, List<Entry> entries) {
        this.product = product;
        this.store = store;
        this.entries = entries;
    }

    @Id
    private String id;

    @DBRef
    @NotNull
    private Product product;

    @DBRef
    @NotNull
    private Store store;

    private List<Entry> entries;

    @Getter
    @Setter
    private static class Entry {
        @DBRef
        private Position position;
        private Double initialAmount;
        private Double currentAmount;
        private Double delta;
        private Double amount;
    }
}
