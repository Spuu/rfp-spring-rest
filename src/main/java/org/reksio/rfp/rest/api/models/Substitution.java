package org.reksio.rfp.rest.api.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Substitution
 */
@Getter
@Setter
public class Substitution extends Document {
    private String description;
    private List<Entry> entries;

    @Getter
    @Setter
    public static class Entry {
        @DBRef
        @NotNull
        private Position srcPosition;

        @DBRef
        @NotNull
        private Position dstPosition;
    }
}
