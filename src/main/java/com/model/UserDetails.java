package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

//@Value.Immutable
@JsonDeserialize
public interface UserDetails {
    @JsonProperty
    String uuid();

    @JsonProperty
    Object address();

    @JsonProperty
    Object info();
}