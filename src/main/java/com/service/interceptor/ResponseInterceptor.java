package com.service.interceptor;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class ResponseInterceptor implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext,
                       ContainerResponseContext responseContext) throws IOException {
        responseContext.getHeaders().add("access-control-allow-origin", "*");
        responseContext.getHeaders().add("access-control-allow-methods", "DELETE, GET, HEAD, OPTIONS, POST, PUT");
        responseContext.getHeaders().add("Access-control-allow-headers", "access-control-allow-origin, Origin, X-Requested-With, Content-Type, Accept, Authorization, Access-Control-Allow-Headers, CORELATION_ID");
        responseContext.getHeaders().add("access-control-allow-credentials", "true");
        responseContext.getHeaders().add("acce  ss-control-expose-headers", "WWW-Authenticate, Server-Authorization");
        responseContext.getHeaders().add("cache-control", "no-cache");
        responseContext.getHeaders().add("Connection", "keep-alive");
    }
}