package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.enums.InvoiceType;
import org.reksio.rfp.rest.api.models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * InvoiceBuilder
 */
public class InvoiceBuilder extends DocumentBuilder<InvoiceBuilder> {
    private Store store;
    private Counterparty counterparty;
    private List<Position> positions;
    private InvoiceType type;

    private InvoiceBuilder() {
        super();
        this.type = Invoice.DEFAULT_INVOICE_TYPE;
        this.positions = new ArrayList<>();
    }

    public static InvoiceBuilder instance() {
        return new InvoiceBuilder();
    }

    public InvoiceBuilder setStore(Store store) {
        this.store = store;
        return this;
    }

    public InvoiceBuilder setCounterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    public InvoiceBuilder setPositions(List<Position> positions) {
        this.positions = positions;
        return this;
    }

    public InvoiceBuilder setType(InvoiceType type) {
        this.type = type;
        return this;
    }

    public Invoice build() {
        Invoice invoice = new Invoice();
        invoice.setName(name);
        invoice.setCounterparty(counterparty);
        invoice.setPositions(positions);
        invoice.setStore(store);
        invoice.setType(type);
        invoice.setCategories(categories);
        invoice.setCreationDate(creationDate);
        invoice.setDocumentDate(documentDate);
        invoice.setLastModificationDate(lastModificationDate);
        return invoice;
    }
}
