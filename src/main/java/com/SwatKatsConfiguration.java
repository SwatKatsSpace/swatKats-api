package com;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.NotEmpty;

import io.dropwizard.Configuration;

public class SwatKatsConfiguration extends Configuration {

    //@NotEmpty annotation will assure that application will not start if appName value will be not defined.
    @NotEmpty
    private String appName;

    //@JsonProperty allows to deserialise and serialise from a YAML property.
    @JsonProperty
    public String getAppName() {
        return appName;
    }

    @JsonProperty
    public void setAppName(final String appName) {
        this.appName = appName;
    }
}
