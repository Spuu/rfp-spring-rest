package org.reksio.rfp.rest.api.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

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
    @Indexed(unique = true)
    private String name;

    private String fullName;
}
