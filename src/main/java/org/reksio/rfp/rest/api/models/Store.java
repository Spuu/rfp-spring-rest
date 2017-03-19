package org.reksio.rfp.rest.api.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Store
 */
@Getter
@Setter
public class Store {
    public Store() {}

    @Builder
    public Store(String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    @Id
    @Setter(AccessLevel.NONE)
    private String id;

    @NotNull(message = "Store name should be provided")
    private String name;

    private String fullName;
}
