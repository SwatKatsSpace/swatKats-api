package com.resources;

import com.model.Article;
import com.service.ArticleService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("articles")
@Produces(MediaType.APPLICATION_JSON)
public class ArticlesResource {

    @Inject
    private ArticleService articleService;

    @GET
    public List<Article> getArticleList() {
        return articleService.getArticleList();
    }
}
