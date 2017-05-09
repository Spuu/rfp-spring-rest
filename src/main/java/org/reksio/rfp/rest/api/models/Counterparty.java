package org.reksio.rfp.rest.api.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Counterparty
 */
@Getter
@Setter
public class Counterparty {
    @Id
    @Setter(AccessLevel.NONE)
    private String id;

    @NotNull
    private String name;

    private String fullName;
}
