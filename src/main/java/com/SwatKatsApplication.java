package com;

import com.dao.*;
import com.filters.ResponseServerFilter;
import com.resources.ArticleResource;
import com.resources.UserResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;
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
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");
        environment.jersey().getResourceConfig().register(new ResponseServerFilter());
        environment.jersey().register(new UserResource(jdbi.onDemand(UserDAO.class), jdbi.onDemand(UserDetailsDAO.class)));
        environment.jersey().register(new ArticleResource(jdbi.onDemand(ArticleDAO.class), jdbi.onDemand(ArticleDetailsDAO.class), jdbi.onDemand(ArticleFinanceDetailsDAO.class), jdbi.onDemand(ArticleMetadataDAO.class)));
    }
}
