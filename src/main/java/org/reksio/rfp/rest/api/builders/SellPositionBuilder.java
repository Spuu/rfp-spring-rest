package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.models.Position;
import org.reksio.rfp.rest.api.models.Product;

import static org.reksio.rfp.rest.api.models.Position.SellPosition.*;

/**
 * SellPositionBuilder
 */
public class SellPositionBuilder {
    private Product product;
    private Double buyNettoPrice;
    private Double sellBruttoPrice;
    private Integer unitNominator;
    private Integer unitDenominator;

    private SellPositionBuilder() {
        this.buyNettoPrice = DEFAULT_BUY_NETTO_PRICE;
        this.sellBruttoPrice = DEFAULT_SELL_BRUTTO_PRICE;
        this.unitNominator = DEFAULT_UNIT_NOMINATOR;
        this.unitDenominator = DEFAULT_UNIT_DENOMINATOR;
    }

    public SellPositionBuilder instance() {
        return new SellPositionBuilder();
    }

    public SellPositionBuilder setProduct(Product product) {
        this.product = product;
        return this;
    }

    public SellPositionBuilder setBuyNettoPrice(Double buyNettoPrice) {
        this.buyNettoPrice = buyNettoPrice;
        return this;
    }

    public SellPositionBuilder setSellBruttoPrice(Double sellBruttoPrice) {
        this.sellBruttoPrice = sellBruttoPrice;
        return this;
    }

    public SellPositionBuilder setUnitNominator(Integer unitNominator) {
        this.unitNominator = unitNominator;
        return this;
    }

    public SellPositionBuilder setUnitDenominator(Integer unitDenominator) {
        this.unitDenominator = unitDenominator;
        return this;
    }

    public Position.SellPosition build() {
        Position.SellPosition sellPosition = new Position.SellPosition();
        sellPosition.setProduct(product);
        sellPosition.setBuyNettoPrice(buyNettoPrice);
        sellPosition.setSellBruttoPrice(sellBruttoPrice);
        sellPosition.setUnitNominator(unitNominator);
        sellPosition.setUnitDenominator(unitDenominator);
        return sellPosition;
    }
}
