package org.reksio.rfp.rest.api.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Category
 */
@Getter
@Setter
public class Category {
    @Id
    @Setter(AccessLevel.NONE)
    private String id;

    @NotNull
    private String name;

    private String type;
}
