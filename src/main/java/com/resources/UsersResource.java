package com.resources;

import com.model.User;
import com.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @GET
    @Path("user")
    public User getUser(@QueryParam("email") Optional<String> email, @QueryParam("aadharId") Optional<String> aadharId) {
        if (aadharId.isPresent()) {
            return userService.getUserByAadharId(aadharId.get());
        }
        if (email.isPresent()) {
            return userService.getUserByEmail(email.get());
        }
        return null;
    }

//    @GET
//    @Path("/")
//    public User getUserByUuid(@QueryParam("email") String email) {
//        return userService.getUserByEmail(email);
//    }

//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public GenericResponse insertUser(ImmutableUser user) {
//        LOGGER.info("getting user info");
//        List<ImmutableUser> immutableUsers = userDAO.findByEmailAndPhoneAndAadhar(user.email(), user.phone().get(), user.aadharId());
//        if (immutableUsers == null || immutableUsers.isEmpty()) {
//            Integer result = userDAO.insert(user.name(), user.email(), user.phone().toString(), user.password(), user.aadharId(), user.panId());
//            if (result > 0) {
//                return new GenericResponse(1, "Sucessfully Updated");
//            } else {
//                return new GenericResponse(0, "Failed to Updated");
//            }
//        } else {
//            return new GenericResponse(0, "Duplicate Records");
//        }
//
//
//    }
//
//    @GET
//    @Path("/completeInfo")
//    public List<UserCompleInfo> getAllCompleteUserDetails() {
//        List<ImmutableUser> users = userDAO.getAll();
//        List<UserCompleInfo> userCompleInfos = new ArrayList<UserCompleInfo>();
//        users.stream().map(u -> {
//            UserCompleInfo userCompleInfo = ImmutableUserCompleInfo.builder()
//                    .user(u)
//                    .userDetails(userDetailsDAO.findId(u.uuid()))
//                    .build();
//            return userCompleInfos.add(userCompleInfo);
//        });
//        return userCompleInfos;
//    }


}
