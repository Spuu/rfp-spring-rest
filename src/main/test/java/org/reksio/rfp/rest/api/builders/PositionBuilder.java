package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.models.Document;
import org.reksio.rfp.rest.api.models.Position;
import org.reksio.rfp.rest.api.models.Product;
import org.reksio.rfp.rest.api.models.Store;
import static org.reksio.rfp.rest.api.models.Position.*;

/**
 * PositionBuilder
 */
public class PositionBuilder {
    private Integer index;
    private Document document;
    private Store store;
    private Product product;
    private Double buyNettoPrice;
    private Double sellBruttoPrice;
    private Double quantity;
    private Double discount;
    private Double retailRate;
    private SellPosition sellPosition;

    private PositionBuilder() {
        this.buyNettoPrice = DEFAULT_BUY_NETTO_PRICE;
        this.sellBruttoPrice = DEFAULT_SELL_BRUTTO_PRICE;
        this.quantity = DEFAULT_QUANTITY;
        this.discount = DEFAULT_DISCOUNT;
        this.retailRate = DEFAULT_RETAIL_RATE;
    }

    public static PositionBuilder instance() {
        return new PositionBuilder();
    }

    public PositionBuilder setIndex(Integer index) {
        this.index = index;
        return this;
    }

    public PositionBuilder setDocument(Document document) {
        this.document = document;
        return this;
    }

    public PositionBuilder setStore(Store store) {
        this.store = store;
        return this;
    }

    public PositionBuilder setProduct(Product product) {
        this.product = product;
        return this;
    }

    public PositionBuilder setBuyNettoPrice(Double buyNettoPrice) {
        this.buyNettoPrice = buyNettoPrice;
        return this;
    }

    public PositionBuilder setSellBruttoPrice(Double sellBruttoPrice) {
        this.sellBruttoPrice = sellBruttoPrice;
        return this;
    }

    public PositionBuilder setQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public PositionBuilder setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    public PositionBuilder setRetailRate(Double retailRate) {
        this.retailRate = retailRate;
        return this;
    }

    public PositionBuilder setSellPosition(SellPosition sellPosition) {
        this.sellPosition = sellPosition;
        return this;
    }

    public Position build() {
        Position position = new Position();
        position.setBuyNettoPrice(buyNettoPrice);
        position.setSellBruttoPrice(sellBruttoPrice);
        position.setProduct(product);
        position.setDiscount(discount);
        position.setDocument(document);
        position.setIndex(index);
        position.setQuantity(quantity);
        position.setRetailRate(retailRate);
        position.setStore(store);
        position.setSellPosition(sellPosition);
        return position;
    }
}
