package com.resources;

import com.model.Article;
import com.service.ArticleService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.UUID;

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
    public Response addArticles(Article article) {
        Integer result = articleService.addNewArticle(article);

        return result > 0 ? Response.ok(201).build() : Response.serverError().build();
    }
}

