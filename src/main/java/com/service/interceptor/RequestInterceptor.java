package com.service.interceptor;

import com.auth.JWTAuth;
import com.resources.LoginResource;
import io.jsonwebtoken.Claims;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Priority;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@PreMatching
public class RequestInterceptor implements ContainerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

    private  final String LOGIN_REQUEST_URI = "login";
    private final String ARTICLE_VIEW_URI = "articles";

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        logger.info("Request Inteceptor");
        logger.info(requestContext.getUriInfo().getPath());
        if(!requestContext.getUriInfo().getPath().contains(LOGIN_REQUEST_URI) && !requestContext.getUriInfo().getPath().contains(ARTICLE_VIEW_URI)) {
            String authorizationToken = requestContext.getHeaderString("Authorization");
            logger.info(authorizationToken);
            try {
                Claims claims = JWTAuth.decodeJwt(authorizationToken);
                if(claims != null) {
                    logger.info(claims.getId() + " : " + claims.getIssuer() + " : " + claims.getSubject())  ;
                    logger.info("Authorization Success");
                }
            } catch (Exception e) {
                logger.error("Authorization Failed");
                throw new BadRequestException("Authorization Failed");
            }
        } else {
            if(requestContext.getUriInfo().getPath().contains(LOGIN_REQUEST_URI))
                logger.info("login request extemption");
            else if(requestContext.getUriInfo().getPath().contains(ARTICLE_VIEW_URI))
                logger.info("article request extemption");
        }
    }
}
