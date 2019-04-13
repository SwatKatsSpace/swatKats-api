package com.service;

import com.auth.JWTAuth;
import com.jdbi.dao.LoginDAO;
import com.jdbi.dao.UserDAO;
import com.model.Login;
import com.model.TokenWrapper;
import com.model.User;
import com.model.immutables.ImmutableTokenWrapper;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.WebApplicationException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Service
@Singleton
public class LoginService {

    @Inject
    private UserDAO userDAO;

    @Inject
    private LoginDAO loginDAO;

    public TokenWrapper getUser(Login user) throws WebApplicationException {

        User loggedInUser;

        if (user.email().isPresent()) {
            loggedInUser = userDAO.getUserByEmailOrPhone(user.email().get(), user.password());
        } else if (user.phone().isPresent()) {
            loggedInUser = userDAO.getUserByEmailOrPhone(user.phone().get(), user.password());
        } else {
            throw new WebApplicationException("Invalid input");
        }

        if (loggedInUser.uuid().isPresent()) {

            /*
                if user is already logged in
             */
            String jwToken = loginDAO.getUserToken(UUID.fromString(loggedInUser.uuid().get()));

            if (jwToken != null && !jwToken.isEmpty()) {
                return ImmutableTokenWrapper.builder()
                        .user(loggedInUser).token(jwToken).build();
            }

            Calendar tokenExpiryDateTime = Calendar.getInstance();
            tokenExpiryDateTime.setTime(new Date());
            tokenExpiryDateTime.set(Calendar.MINUTE, 30);

            long tokenExpiry = tokenExpiryDateTime.getTimeInMillis();

            jwToken = JWTAuth.generateJWT(loggedInUser.uuid().get(), "SWATKATS", loggedInUser.email(), tokenExpiry);

            loginDAO.insertUserToken(UUID.fromString(loggedInUser.uuid().get()), jwToken);

            return ImmutableTokenWrapper.builder()
                    .user(loggedInUser).token(jwToken).build();
        } else {
            throw new WebApplicationException("user not found");
        }
    }
}
