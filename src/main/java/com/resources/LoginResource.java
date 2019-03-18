package com.resources;

import com.auth.JWTAuth;
import com.model.GenericResponse;
import com.model.User;
import com.model.immutables.ImmutableArticle;
import com.model.immutables.ImmutableGenericResponse;
import com.model.immutables.ImmutableUser;
import com.service.LoginService;
import com.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@Path("login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {

    @Inject
    private UserService userService;

    @Inject
    private LoginService loginService;

    @POST
    public Response login(ImmutableUser user) {
        try {
            User loggedInUser = loginService.getUserByUserNameAndPassword(user);
            if(loggedInUser != null) {
                String jwToken = JWTAuth.generateJWT(loggedInUser.uuid().get(), "SWATKATS", loggedInUser.email(), new Date().getTime());
                ImmutableGenericResponse immutableGenericResponse = ImmutableGenericResponse.builder().body(loggedInUser).token(jwToken).build();
                return Response.ok(immutableGenericResponse).build();
            } else {
                throw new BadRequestException();
            }

        } catch (Exception e) {
            throw new BadRequestException();
        }

    }
}
