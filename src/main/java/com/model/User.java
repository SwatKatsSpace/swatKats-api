package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
public interface User {
    @JsonProperty
    String uuid();
    @JsonProperty
    String name();
    @JsonProperty
    String email();
    @JsonProperty
    Optional<String> phone();
    @JsonProperty
    String password();
    @JsonProperty
    String aadharId();
    @JsonProperty
    String panId();
}