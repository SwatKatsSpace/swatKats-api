package com.resources;

import com.model.User;
import com.model.immutables.ImmutableUser;
import com.service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public class UsersResource {

    @Inject
    private UserService userService;


    @GET
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @GET
    @Path("user/{userUuid}")
    public User getUser(@PathParam("userUuid") Optional<UUID> userUuid) {
        return userService.getUserByUuid(userUuid.get());
    }

    //TODO: this has to go to separate resource
    @GET
    @Path("user")
    public User getUser(@QueryParam("email") Optional<String> email,
                        @QueryParam("aadharId") Optional<String> aadharId) {
        if (aadharId.isPresent()) {
            return userService.getUserByAadharId(aadharId.get());
        }
        if (email.isPresent()) {
            return userService.getUserByEmail(email.get());
        }
        return null;
    }

    @POST
    public Response createUser(ImmutableUser user) {
        userService.createUser(user);
        return Response.ok(201).build();
    }
}
