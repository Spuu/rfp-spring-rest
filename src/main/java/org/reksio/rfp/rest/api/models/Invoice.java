package org.reksio.rfp.rest.api.models;

import lombok.Getter;
import lombok.Setter;
import org.reksio.rfp.rest.api.enums.InvoiceType;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Invoice
 */
@Getter
@Setter
public class Invoice extends Document {

    public static final InvoiceType DEFAULT_INVOICE_TYPE = InvoiceType.BUY;

    public Invoice() {
        this.type = DEFAULT_INVOICE_TYPE;
        this.positions = new ArrayList<>();
    }

    @DBRef
    @NotNull
    private Store store;

    @DBRef
    @NotNull
    private Counterparty counterparty;

    @DBRef
    private List<Position> positions;

    private InvoiceType type;
}
