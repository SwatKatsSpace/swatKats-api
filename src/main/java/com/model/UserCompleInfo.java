package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

@Value.Immutable
public interface UserCompleInfo {
    @JsonProperty
    User user();
    @JsonProperty
    UserDetails userDetails();
}
