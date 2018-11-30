package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

//@Value.Immutable
@JsonDeserialize
public interface ArticleMetadata {
    @JsonProperty
    String uuid();

    @JsonProperty
    String description();

    @JsonProperty
    String category();

    @JsonProperty
    String[] tags();
}