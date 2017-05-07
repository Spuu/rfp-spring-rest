package org.reksio.rfp.rest.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.reksio.rfp.rest.api.enums.ProductStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Product
 */
@Getter
@Setter
public class Product {

    private static final ProductStatus DEFAULT_STATUS = ProductStatus.NEW;
    private static final Double DEFAULT_PIH_AMOUNT = 1.0;
    private static final String DEFAULT_PIH_UNIT = "g";
    private static final String DEFAULT_SELL_UNIT = "szt";
    private static final Integer DEFAULT_VAT = 23;
    private static final Boolean DEFAULT_ENABLED = true;
    private static final Boolean DEFAULT_BARCODE = false;

    public Product() {
        this.enabled = DEFAULT_ENABLED;
        this.barcode = DEFAULT_BARCODE;
        this.pihAmount = DEFAULT_PIH_AMOUNT;
        this.pihUnit = DEFAULT_PIH_UNIT;
        this.sellUnit = DEFAULT_SELL_UNIT;
        this.vat = DEFAULT_VAT;
        this.status = DEFAULT_STATUS;
        this.groupee = new ArrayList<>();
        this.children = new ArrayList<>();
        this.cashRegisterInfo =
                CashRegisterInfo.builder()
                        .price(0.0)
                        .vat(this.vat)
                        .build();
    }

    @Builder
    public Product(Boolean enabled, Boolean barcode, String ean, String name, Double pihAmount, String pihUnit,
                   String sellUnit, Integer vat, Product grouper, List<Product> groupee, Product father,
                   List<Product> children, ProductStatus status, CashRegisterInfo cashRegisterInfo) {

        this.enabled = enabled != null ? enabled : DEFAULT_ENABLED;
        this.barcode = barcode != null ? barcode : DEFAULT_BARCODE;
        this.ean = ean;
        this.name = name;
        this.pihAmount = pihAmount != null ? pihAmount : DEFAULT_PIH_AMOUNT;
        this.pihUnit = pihUnit != null ? pihUnit : DEFAULT_PIH_UNIT;
        this.sellUnit = sellUnit != null ? sellUnit : DEFAULT_SELL_UNIT;
        this.vat = vat != null ? vat : DEFAULT_VAT;
        this.grouper = grouper;
        this.groupee = groupee;
        this.father = father;
        this.children = children;
        this.status = status != null ? status : DEFAULT_STATUS;
        this.cashRegisterInfo = cashRegisterInfo != null ? cashRegisterInfo :
                CashRegisterInfo.builder()
                        .name(this.name)
                        .price(0.0)
                        .vat(this.vat)
                        .build();
    }

    @Id
    private String id;

    @NotNull
    private Boolean enabled;

    @NotNull
    private Boolean barcode;

    @NotNull
    private String ean;

    @NotNull
    private String name;

    @NotNull
    @Min(value = 1)
    private Double pihAmount;

    @NotNull
    private String pihUnit;

    @NotNull
    private String sellUnit;

    @NotNull
    @Min(value = 0)
    private Integer vat;

    @DBRef
    private Product grouper;

    @DBRef
    private List<Product> groupee;

    @DBRef
    private Product father;

    @DBRef
    private List<Product> children;

    @NotNull
    private ProductStatus status;

    @NotNull
    private CashRegisterInfo cashRegisterInfo;

    @Getter
    @Setter
    private static class CashRegisterInfo {
        public CashRegisterInfo() {}

        @Builder
        public CashRegisterInfo(String name, Double price, Integer vat) {
            this.name = name;
            this.price = price;
            this.vat = vat;
        }

        private String name;
        private Double price;
        private Integer vat;
    }
}
