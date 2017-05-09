package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.models.Counterparty;

/**
 * CounterpartyBuilder
 */
public class CounterpartyBuilder {
    private String name;
    private String fullName;

    public static CounterpartyBuilder instance() {
        return new CounterpartyBuilder();
    }

    public CounterpartyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CounterpartyBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Counterparty build() {
        Counterparty counterparty = new Counterparty();
        counterparty.setName(name);
        counterparty.setFullName(fullName);
        return counterparty;
    }
}
