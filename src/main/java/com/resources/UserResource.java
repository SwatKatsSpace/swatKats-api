package com.resources;

import com.dao.UserDAO;
import com.dao.UserDetailsDAO;
import com.mapper.UserDetailsMapper;
import com.model.User;
import com.model.UserDetails;
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

    private final UserDAO userDAO;
    private final UserDetailsDAO userDetailsDAO;

    public UserResource(UserDAO userDAO, UserDetailsDAO userDetailsDAO) {
        this.userDAO = userDAO;
        this.userDetailsDAO = userDetailsDAO;
    }

    @Path("/user")
    @GET
    public Integer insertUser() {
        //LOGGER.info("getting user info");
        return userDAO.insert("jay", "jvs@gmail.com", "0001110011", "12345","0011001100111", "123456");
    }

    /*@Path("/create/user")
    @GET
    public Integer createUserTable() {
        LOGGER.info("Creating users table");
        return dao.create();
    }*/

    @Path("/get/user")
    @GET
    public User getUser() {
        User user = userDAO.findByName("%jay%");
        return user;
    }

}
