package org.reksio.rfp.rest.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.reksio.rfp.rest.api.dictionaries.InvoiceType;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * Invoice
 */
@Getter
@Setter
public class Invoice extends Document {

    public Invoice() {}

    @Builder
    public Invoice(String name, LocalDate creationDate, LocalDate documentDate,
                   LocalDate lastModificationDate, List<Category> categories, Store store,
                   Counterparty counterparty, List<Position> positions, InvoiceType type) {
        super(name, creationDate, documentDate, lastModificationDate, categories);
        this.store = store;
        this.counterparty = counterparty;
        this.positions = positions;
        this.type = type;
    }

    @DBRef
    @NotNull
    private Store store;

    @DBRef
    @NotNull
    private Counterparty counterparty;

    @DBRef
    private List<Position> positions;

    private InvoiceType type = InvoiceType.BUY;
}
