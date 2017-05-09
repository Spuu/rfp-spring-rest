package org.reksio.rfp.rest.api.builders;

import org.reksio.rfp.rest.api.models.Category;

/**
 * CategoryBuilder
 */
public class CategoryBuilder {
    private String name;
    private String type;

    public static CategoryBuilder instance() {
        return new CategoryBuilder();
    }

    public CategoryBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CategoryBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Category build() {
        Category category = new Category();
        category.setName(name);
        category.setType(type);
        return category;
    }
}
