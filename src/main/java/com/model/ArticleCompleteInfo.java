package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

//@Value.Immutable
@JsonDeserialize
public interface ArticleCompleteInfo {
    @JsonProperty
    Article article();
    @JsonProperty
    ArticleDetails articleDetails();
    @JsonProperty
    ArticleFinanceDetails articleFinanceDetails();
    @JsonProperty
    ArticleMetadata articleMetadata();
}
