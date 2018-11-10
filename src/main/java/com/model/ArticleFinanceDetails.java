package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

//@Value.Immutable
public interface ArticleFinanceDetails
{
    @JsonProperty
    String bankAccountNumber();

    @JsonProperty
    String ifscCode();

    @JsonProperty
    String bankName();

    @JsonProperty
    String nameOnAccount();
}
