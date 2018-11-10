package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

//@Value.Immutable
public interface UserDetails {
    @JsonProperty
    Object address();

    @JsonProperty
    Object info();
}