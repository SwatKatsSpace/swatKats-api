package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

//@Value.Immutable
public interface ArticleMetadata {
    @JsonProperty
    String description();

    @JsonProperty
    String category();

    @JsonProperty
    String[] tags();
}