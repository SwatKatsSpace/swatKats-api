package com.resources;

import com.model.User;
import com.model.immutables.ImmutableArticle;
import com.model.immutables.ImmutableUser;
import com.service.LoginService;
import com.service.UserService;

import javax.inject.Inject;
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
            return Response.ok(loggedInUser).build();
        } catch (Exception e) {
            return Response.ok(400).build();
        }

    }
}
