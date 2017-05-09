package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.models.Product;

/**
 * CashRegisterInfoBuilder
 */
public class CashRegisterInfoBuilder {
    private String name;
    private Double price;
    private Integer vat;

    public static CashRegisterInfoBuilder instance() {
        return new CashRegisterInfoBuilder();
    }

    public CashRegisterInfoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CashRegisterInfoBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public CashRegisterInfoBuilder setVat(Integer vat) {
        this.vat = vat;
        return this;
    }

    public Product.CashRegisterInfo build() {
        Product.CashRegisterInfo cashRegisterInfo = new Product.CashRegisterInfo();
        cashRegisterInfo.setName(name);
        cashRegisterInfo.setPrice(price);
        cashRegisterInfo.setVat(vat);
        return cashRegisterInfo;
    }
}
