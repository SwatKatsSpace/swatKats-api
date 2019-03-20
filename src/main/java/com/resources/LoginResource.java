package com.resources;

import com.auth.JWTAuth;
import com.model.GenericResponse;
import com.model.User;
import com.model.immutables.ImmutableArticle;
import com.model.immutables.ImmutableGenericResponse;
import com.model.immutables.ImmutableUser;
import com.service.LoginService;
import com.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.*;

@Path("login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {

    private static final Logger logger = LoggerFactory.getLogger(LoginResource.class);

    @Inject
    private UserService userService;

    @Inject
    private LoginService loginService;


    @POST
    public Response login(ImmutableUser user) {
        logger.info("User Resource");
        try {
            User loggedInUser = loginService.getUserByUserNameAndPassword(user);
            if(loggedInUser != null) {
                Calendar tokenExpiryDateTime = Calendar.getInstance();
                tokenExpiryDateTime.setTime(new Date());
                tokenExpiryDateTime.set(Calendar.MINUTE, 30);
                long tokenExpiry = tokenExpiryDateTime.getTimeInMillis();
                String jwToken = JWTAuth.generateJWT(loggedInUser.uuid().get(), "SWATKATS", loggedInUser.email(), tokenExpiry);
                ImmutableGenericResponse immutableGenericResponse = ImmutableGenericResponse.builder().body(loggedInUser).token(jwToken).build();
                return Response.ok(immutableGenericResponse).build();
            } else {
                logger.warn("No user found " + loggedInUser);
                throw new BadRequestException();
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new BadRequestException();
        }

    }
}
