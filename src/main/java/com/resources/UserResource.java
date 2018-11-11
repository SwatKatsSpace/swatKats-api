package com.resources;

import com.dao.UserDAO;
import com.dao.UserDetailsDAO;
import com.mapper.UserDetailsMapper;
import com.model.User;
import com.model.UserCompleInfo;
import com.model.UserDetails;
import com.model.immutables.ImmutableUser;
import com.model.immutables.ImmutableUserCompleInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("/swatkats/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    private final UserDAO userDAO;
    private final UserDetailsDAO userDetailsDAO;

    public UserResource(UserDAO userDAO, UserDetailsDAO userDetailsDAO) {
        this.userDAO = userDAO;
        this.userDetailsDAO = userDetailsDAO;
    }

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Integer insertUser(ImmutableUser user) {
        LOGGER.info("getting user info");
        return userDAO.insert(user.name(), user.email(), user.phone().toString(), user.password(), user.aadharId(), user.panId());

    }

    /*@Path("/create/user")
    @GET
    public Integer createUserTable() {
        LOGGER.info("Creating users table");
        return dao.create();
    }*/

    @Path("/get")
    @GET
    public User getAllUsers() {
        User user = userDAO.getAll();
        return user;
    }

    public List<UserCompleInfo>  getAllCompleteUserDetails() {
        List<ImmutableUser> users = userDAO.getAll();
        List<UserCompleInfo> userCompleInfos = new ArrayList<UserCompleInfo>();
        users.stream().map(u -> {
            UserCompleInfo userCompleInfo = ImmutableUserCompleInfo.builder()
                    .user(u)
                    .userDetails(userDetailsDAO.findId(u.uuid()))
                    .build();
            return userCompleInfos.add(userCompleInfo);
        });

    }

}
