package com.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//@Value.Immutable
@JsonDeserialize
public interface TokenWrapper {

    User user();

    String token();
}
