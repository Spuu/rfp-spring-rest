package org.reksio.rfp.rest.api.builders;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * StoreBuilder
 */
@Getter
@Setter
public class StoreBuilder {
    private StoreBuilder() {}

    @Builder
    public StoreBuilder(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    @Id
    @Setter(AccessLevel.NONE)
    private String id;

    @NotNull(message = "StoreBuilder name should be provided")
    private String name;

    private String fullName;
}
