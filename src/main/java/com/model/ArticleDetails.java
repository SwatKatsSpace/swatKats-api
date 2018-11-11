package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

//@Value.Immutable
public interface ArticleDetails {
    @JsonProperty
    String uuid();

    @JsonProperty
    String[] photo();

    @JsonProperty
    String lat();

    @JsonProperty
    String lng();

    @JsonProperty
    Object address();

    @JsonProperty
    Object info();
}