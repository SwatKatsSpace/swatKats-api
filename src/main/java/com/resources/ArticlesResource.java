package com.resources;

import com.model.Article;
import com.model.immutables.ImmutableArticle;
import com.service.ArticleService;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("articles")
@Produces(MediaType.APPLICATION_JSON)
public class ArticlesResource {

    @Inject
    private ArticleService articleService;

    @GET
    public List<Article> getArticleList() {
        return articleService.getArticleList();
    }

    @GET
    @Path("{articleUuid}")
    public Article getUser(@PathParam("articleUuid") UUID userUuid) {
        return articleService.getArticleByUuid(userUuid);
    }

    @POST
    public Response createArticle(ImmutableArticle article) {

        articleService.createArticle(article);
        return Response.ok(201).build();
    }
}

