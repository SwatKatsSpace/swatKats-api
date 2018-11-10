package com.resources;

import com.dao.UserDAO;
import com.model.ImmutableUser;
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

    private final UserDAO dao;

    public UserResource(UserDAO dao) {
        this.dao = dao;
    }

    @Path("/user")
    @GET
    public Integer insertUser() {
        LOGGER.info("getting user info");
        return dao.insert("2", "jay", "jvs@gmail.com", "0001110011", "0011001100111");
    }

    @Path("/create/user")
    @GET
    public Integer createUserTable() {
        LOGGER.info("Creating users table");
        return dao.create();
    }

    @Path("/get/user")
    @GET
    public User getUser() {
        User user = dao.findByName("%jay%");
        return user;
    }

}
