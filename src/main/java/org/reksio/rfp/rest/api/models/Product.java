package org.reksio.rfp.rest.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.reksio.rfp.rest.api.enums.ProductStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Product
 */
@Getter
@Setter
public class Product {

    public Product() {
    }

    @Builder
    public Product(boolean enabled, boolean barcode, String ean, String name, Double pihAmount, String pihUnit,
                   String sellUnit, Integer vat, Product grouper, List<Product> groupee, Product father,
                   List<Product> children, ProductStatus status, CashRegister cashRegister) {
        this.enabled = enabled;
        this.barcode = barcode;
        this.ean = ean;
        this.name = name;
        this.pihAmount = pihAmount;
        this.pihUnit = pihUnit;
        this.sellUnit = sellUnit;
        this.vat = vat;
        this.grouper = grouper;
        this.groupee = groupee;
        this.father = father;
        this.children = children;
        this.status = status;
        this.cashRegister = cashRegister;
    }

    @Id
    private String id;

    private boolean enabled = true;
    private boolean barcode = false;

    @NotNull
    private String ean;

    @NotNull
    private String name;

    @Min(value = 1)
    private Double pihAmount = 1.0;

    private String pihUnit = "g";

    private String sellUnit = "szt";

    @Min(value = 0)
    private Integer vat = 23;

    @DBRef
    private Product grouper;

    @DBRef
    private List<Product> groupee;

    @DBRef
    private Product father;

    @DBRef
    private List<Product> children;

    private ProductStatus status = ProductStatus.NEW;

    private CashRegister cashRegister = CashRegister.builder()
            .name(this.name)
            .price(0.0)
            .vat(this.vat)
            .build();

    @Builder
    @Getter
    @Setter
    private static class CashRegister {
        private String name;
        private Double price;
        private Integer vat;
    }
}
