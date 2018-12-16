package com.resources;

import com.model.User;
import com.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UsersResource {

    @Inject
    private UserService userService;


    @GET
    public List<User> getAllUsers() {
        return userService.getUserList();

    }

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
