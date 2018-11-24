package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

//@Value.Immutable
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
