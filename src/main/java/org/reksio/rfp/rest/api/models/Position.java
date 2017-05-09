package org.reksio.rfp.rest.api.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Position
 */
@Getter
@Setter
public class Position {

    public static final Double DEFAULT_BUY_NETTO_PRICE = 0.0;
    public static final Double DEFAULT_SELL_BRUTTO_PRICE = 0.0;
    public static final Double DEFAULT_QUANTITY = 1.0;
    public static final Double DEFAULT_DISCOUNT = 0.0;
    public static final Double DEFAULT_RETAIL_RATE = 0.0;

    public Position() {
        this.buyNettoPrice = DEFAULT_BUY_NETTO_PRICE;
        this.sellBruttoPrice = DEFAULT_SELL_BRUTTO_PRICE;
        this.quantity = DEFAULT_QUANTITY;
        this.discount = DEFAULT_DISCOUNT;
        this.retailRate = DEFAULT_RETAIL_RATE;
        this.sellPosition = new SellPosition();
    }

    @Id
    private String id;

    @NotNull
    private Integer index;

    @DBRef
    @NotNull
    private Document document;

    @DBRef
    @NotNull
    private Store store;

    @DBRef
    @NotNull
    private Product product;

    @Min(value = 0)
    private Double buyNettoPrice;

    @Min(value = 0)
    private Double sellBruttoPrice;

    @Min(value = 0)
    private Double quantity;

    @Min(value = 0)
    private Double discount;

    @Min(value = 0)
    private Double retailRate;

    @NotNull
    private SellPosition sellPosition;

    @Getter
    @Setter
    public static class SellPosition {
        public static final Double DEFAULT_BUY_NETTO_PRICE = 0.0;
        public static final Double DEFAULT_SELL_BRUTTO_PRICE = 0.0;
        public static final Integer DEFAULT_UNIT_NOMINATOR = 1;
        public static final Integer DEFAULT_UNIT_DENOMINATOR = 1;

        public SellPosition() {
            this.buyNettoPrice = DEFAULT_BUY_NETTO_PRICE;
            this.sellBruttoPrice = DEFAULT_SELL_BRUTTO_PRICE;
            this.unitNominator = DEFAULT_UNIT_NOMINATOR;
            this.unitDenominator = DEFAULT_UNIT_DENOMINATOR;
        }

        @DBRef
        @NotNull
        private Product product;

        @Min(value = 0)
        private Double buyNettoPrice;

        @Min(value = 0)
        private Double sellBruttoPrice;

        @Min(value = 0)
        private Integer unitNominator;

        @Min(value = 0)
        private Integer unitDenominator;
    }
}
