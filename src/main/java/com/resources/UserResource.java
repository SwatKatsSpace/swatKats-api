package com.resources;

import com.UIResponse.GenericResponse;
import com.dao.UserDAO;
import com.dao.UserDetailsDAO;
import com.model.User;
import com.model.UserCompleInfo;
import com.model.immutables.ImmutableUser;
import com.model.immutables.ImmutableUserCompleInfo;
import org.apache.commons.lang3.StringUtils;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/swatkats/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    private final UserDAO userDAO;
    private final UserDetailsDAO userDetailsDAO;
    private final Jdbi jdbi;

    public UserResource(Jdbi jdbi, UserDAO userDAO, UserDetailsDAO userDetailsDAO) {
        this.userDAO = userDAO;
        this.userDetailsDAO = userDetailsDAO;
        this.jdbi = jdbi;
    }

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public GenericResponse insertUser(ImmutableUser user) {
        LOGGER.info("getting user info");
        List<ImmutableUser> immutableUsers = userDAO.findByEmailAndPhoneAndAadhar(user.email(), user.phone().get(), user.aadharId());
        if(immutableUsers == null || immutableUsers.isEmpty()) {
            Integer result = userDAO.insert(user.name(), user.email(), user.phone().toString(), user.password(), user.aadharId(), user.panId());
            if(result > 0 ) {
                return new GenericResponse(1, "Sucessfully Updated");
            } else {
                return new GenericResponse(0, "Failed to Updated");
            }
        }
        else {
            return new GenericResponse(0, "Duplicate Records");
        }


    }

    /*@Path("/create/user")
    @GET
    public Integer createUserTable() {
        LOGGER.info("Creating users table");
        return dao.create();
    }*/

    @Path("/get")
    @GET
    public List<ImmutableUser> getAllUsers() {
        List<ImmutableUser> users = userDAO.getAll();
        return users;
    }

    @GET
    @Path("/completeInfo")
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
        return userCompleInfos;
    }



}
