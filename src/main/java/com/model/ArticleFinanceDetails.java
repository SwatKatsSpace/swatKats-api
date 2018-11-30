package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

//@Value.Immutable
@JsonDeserialize
public interface ArticleFinanceDetails {
    @JsonProperty
    String uuid();

    @JsonProperty
    String bankAccountNumber();

    @JsonProperty
    String ifscCode();

    @JsonProperty
    String bankName();

    @JsonProperty
    String nameOnAccount();
}
