package com;

import com.resources.UserResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwatKatsApplication extends Application<SwatKatsConfiguration> {
    public static final Logger LOGGER = LoggerFactory.getLogger(SwatKatsApplication.class);

    public static void main(final String[] args) throws Exception {
        new SwatKatsApplication().run(args);
    }

    @Override
    public void run(final SwatKatsConfiguration configuration, final Environment environment) throws Exception {
        LOGGER.info("Application name: {}", configuration.getAppName());

        environment.jersey().register(new UserResource());
    }
}
