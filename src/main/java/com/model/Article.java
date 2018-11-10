package com.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

import java.util.Optional;

//@Value.Immutable
public interface Article {
    @JsonProperty
    String name();
    @JsonProperty
    String email();
    @JsonProperty
    Optional<String> phone();
    @JsonProperty
    String aadharId();
    @JsonProperty
    String panId();
}