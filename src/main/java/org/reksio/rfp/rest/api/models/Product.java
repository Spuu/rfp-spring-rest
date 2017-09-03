package org.reksio.rfp.rest.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    public static final ProductStatus DEFAULT_STATUS = ProductStatus.NEW;
    public static final Double DEFAULT_PIH_AMOUNT = 1.0;
    public static final String DEFAULT_PIH_UNIT = "g";
    public static final String DEFAULT_SELL_UNIT = "szt";
    public static final Integer DEFAULT_VAT = 23;
    public static final Boolean DEFAULT_ENABLED = true;
    public static final Boolean DEFAULT_BARCODE = false;

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
        this.cashRegisterInfo = new CashRegisterInfo();
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
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Product grouper;

    @DBRef
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<Product> groupee;

    @DBRef
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Product father;

    @DBRef
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<Product> children;

    @NotNull
    private ProductStatus status;

    @NotNull
    private CashRegisterInfo cashRegisterInfo;

    @Getter
    @Setter
    public static class CashRegisterInfo {
        private String name;
        private Double price;
        private Integer vat;
    }
}
