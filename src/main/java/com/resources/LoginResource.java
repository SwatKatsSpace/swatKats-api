package com.resources;

import com.model.TokenWrapper;
import com.model.immutables.ImmutableLogin;
import com.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

@Path("login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {

    private static final Logger logger = LoggerFactory.getLogger(LoginResource.class);

    @Inject
    private LoginService loginService;

    @POST
    public TokenWrapper login(ImmutableLogin user) throws WebApplicationException {

        logger.info("login resource");

        return loginService.getUser(user);
    }
}
