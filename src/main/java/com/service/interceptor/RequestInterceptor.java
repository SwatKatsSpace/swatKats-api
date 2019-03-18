package com.service.interceptor;

import com.auth.JWTAuth;
import io.jsonwebtoken.Claims;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class RequestInterceptor implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        String authorizationToken = requestContext.getHeaderString("Authorization");
        try {
            Claims claims = JWTAuth.decodeJwt(authorizationToken);
            if(claims != null) {
                System.out.println("Authorization Success");
            }
        } catch (Exception e) {
            throw new BadRequestException();
        }


    }
}
