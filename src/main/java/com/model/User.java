package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

//@Value.Immutable
@JsonDeserialize
public interface User {
    @JsonProperty
    Optional<String> uuid();
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