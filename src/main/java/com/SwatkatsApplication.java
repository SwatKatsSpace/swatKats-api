package com;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;
import ru.vyarus.guicey.jdbi3.JdbiBundle;

public class SwatkatsApplication extends Application<SwatkatsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SwatkatsApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<SwatkatsConfiguration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                .enableAutoConfig("com.resources", "com.jdbi.dao", "com.jdbi.mapper")
                .bundles(JdbiBundle
                        .<SwatkatsConfiguration>forDatabase((conf, env) -> conf.getDatabase()))
                .build());
    }

    @Override
    public void run(SwatkatsConfiguration swatkatsConfiguration, Environment environment) throws Exception {
    }
}
