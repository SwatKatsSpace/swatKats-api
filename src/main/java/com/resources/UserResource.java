package com.resources;

import com.model.User;
import com.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/swatkats")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    @Path("/user")
    @GET
    public User getUser() {
        LOGGER.info("getting user info");
        UserService.getUser();
        return UserService.getUser();
    }
}
