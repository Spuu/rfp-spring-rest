package org.reksio.rfp.rest.api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.reksio.rfp.rest.api.services.LocalDateTimeDeserializer;
import org.reksio.rfp.rest.api.services.LocalDateTimeSerializer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Document
 */
@Getter
@Setter
public abstract class Document {

    Document() {
        this.creationDate = LocalDateTime.now();
        this.documentDate = LocalDateTime.now();
        this.lastModificationDate = LocalDateTime.now();
        this.categories = new ArrayList<>();
    }

    @Id
    @Setter(AccessLevel.NONE)
    protected String id;

    @NotNull
    protected String name;

    //@JsonDeserialize(using = LocalDateTimeDeserializer.class)
//    @JsonSerialize(using = LocalDateTimeSerializer.class)
    protected LocalDateTime documentDate;

    ///@JsonDeserialize(using = LocalDateTimeDeserializer.class)
//    @JsonSerialize(using = LocalDateTimeSerializer.class)
    protected LocalDateTime creationDate;

    //@JsonDeserialize(using = LocalDateTimeDeserializer.class)
//    @JsonSerialize(using = LocalDateTimeSerializer.class)
    protected LocalDateTime lastModificationDate;

    @DBRef
    protected List<Category> categories;
}
