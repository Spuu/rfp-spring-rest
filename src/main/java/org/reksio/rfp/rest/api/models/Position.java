package org.reksio.rfp.rest.api.models;

import lombok.Builder;
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

    @Id
    private String id;

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
    private Double buyNettoPrice = 0.0;

    @Min(value = 0)
    private Double sellBruttoPrice = 0.0;

    @Min(value = 0)
    private Double quantity = 1.0;

    @Min(value = 0)
    private Double discount = 0.0;

    @Min(value = 0)
    private Double retailRate = 0.0;

    private Sell sell = Sell.builder()
            .product(product)
            .buyNettoPrice(buyNettoPrice)
            .sellBruttoPrice(sellBruttoPrice)
            .build();

    @Getter
    @Setter
    @Builder
    public static class Sell {
        @DBRef
        @NotNull
        private Product product;

        @Min(value = 0)
        private Double buyNettoPrice = 0.0;

        @Min(value = 0)
        private Double sellBruttoPrice = 0.0;

        @Min(value = 0)
        private Integer unitNominator = 1;

        @Min(value = 0)
        private Integer unitDenominator = 1;
    }
}
