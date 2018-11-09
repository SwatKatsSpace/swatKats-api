package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

//@Value.Immutable
@JsonSerialize(as = ImmutableUser.class)
public interface User {
    @JsonProperty
    String name();
    @JsonProperty
    String email();
    @JsonProperty
    Optional<String> phone();
    @JsonProperty
    String aadharId();
}