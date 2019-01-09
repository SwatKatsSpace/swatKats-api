package com.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

//@Value.Immutable
@JsonDeserialize
public interface Article {
    @JsonProperty
    String uuid();

    @JsonProperty
    String firstName();

    @JsonProperty
    String lastName();

    @JsonProperty
    String email();

    @JsonProperty
    Optional<String> phone();

    @JsonProperty
    String aadharId();

    @JsonProperty
    String panId();

    @JsonProperty
    String image();

    @JsonProperty
    String relation();

    @JsonProperty
    String description();

    @JsonProperty
    String likes();
}