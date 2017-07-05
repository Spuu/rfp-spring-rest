package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.enums.ProductStatus;
import org.reksio.rfp.rest.api.models.Product;

import java.util.ArrayList;
import java.util.List;

import static org.reksio.rfp.rest.api.models.Product.*;

/**
 * ProductBuilder
 */
public class ProductBuilder {
    private Boolean enabled;
    private Boolean barcode;
    private String ean;
    private String name;
    private Double pihAmount;
    private String pihUnit;
    private String sellUnit;
    private Integer vat;
    private Product grouper;
    private List<Product> groupee;
    private Product father;
    private List<Product> children;
    private ProductStatus status;
    private CashRegisterInfo cashRegisterInfo;

    private ProductBuilder() {
        this.enabled = DEFAULT_ENABLED;
        this.barcode = DEFAULT_BARCODE;
        this.pihAmount = DEFAULT_PIH_AMOUNT;
        this.pihUnit = DEFAULT_PIH_UNIT;
        this.sellUnit = DEFAULT_SELL_UNIT;
        this.vat = DEFAULT_VAT;
        this.status = DEFAULT_STATUS;
        this.groupee = new ArrayList<>();
        this.children = new ArrayList<>();
        this.cashRegisterInfo = new CashRegisterInfo();
    }

    public static ProductBuilder instance() {
        return new ProductBuilder();
    }

    public ProductBuilder setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ProductBuilder setBarcode(Boolean barcode) {
        this.barcode = barcode;
        return this;
    }

    public ProductBuilder setEan(String ean) {
        this.ean = ean;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPihAmount(Double pihAmount) {
        this.pihAmount = pihAmount;
        return this;
    }

    public ProductBuilder setPihUnit(String pihUnit) {
        this.pihUnit = pihUnit;
        return this;
    }

    public ProductBuilder setSellUnit(String sellUnit) {
        this.sellUnit = sellUnit;
        return this;
    }

    public ProductBuilder setVat(Integer vat) {
        this.vat = vat;
        return this;
    }

    public ProductBuilder setGrouper(Product grouper) {
        this.grouper = grouper;
        return this;
    }

    public ProductBuilder setGroupee(List<Product> groupee) {
        this.groupee = groupee;
        return this;
    }

    public ProductBuilder setFather(Product father) {
        this.father = father;
        return this;
    }

    public ProductBuilder setChildren(List<Product> children) {
        this.children = children;
        return this;
    }

    public ProductBuilder setStatus(ProductStatus status) {
        this.status = status;
        return this;
    }

    public Product build() {
        Product product = new Product();

        product.setEnabled(enabled);
        product.setBarcode(barcode);
        product.setEan(ean);
        product.setName(name);
        product.setPihAmount(pihAmount);
        product.setPihUnit(pihUnit);
        product.setSellUnit(sellUnit);
        product.setVat(vat);
        product.setGrouper(grouper);
        product.setGroupee(groupee);
        product.setFather(father);
        product.setChildren(children);
        product.setStatus(status);
        product.setCashRegisterInfo(cashRegisterInfo);
        return product;
    }
}
