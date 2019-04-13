package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Optional;

//@Value.Immutable
@JsonDeserialize
public interface Login {

    @JsonProperty
    Optional<String> phone();

    @JsonProperty
    Optional<String> email();

    @JsonProperty
    String password();
}
