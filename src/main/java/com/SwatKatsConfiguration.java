package com;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class SwatKatsConfiguration extends Configuration {
    @Valid
    @NotNull
    private DataSourceFactory database = new DataSourceFactory();

    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory factory) {
        this.database = factory;
    }

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
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
