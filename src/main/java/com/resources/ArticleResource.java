package com.resources;

import com.dao.*;
import com.model.Article;
import com.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/swatkats/article")
@Produces(MediaType.APPLICATION_JSON)
public class ArticleResource {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    private final ArticleDAO articleDAO;
    private final ArticleDetailsDAO articleDetailsDAO;
    private final ArticleFinanceDetailsDAO articleFinanceDetailsDAO;
    private final ArticleMetadataDAO articleMetadataDAO;

    public ArticleResource(ArticleDAO articleDAO, ArticleDetailsDAO articleDetailsDAO, ArticleFinanceDetailsDAO articleFinanceDetailsDAO, ArticleMetadataDAO articleMetadataDAO) {
        this.articleDAO = articleDAO;
        this.articleDetailsDAO = articleDetailsDAO;
        this.articleFinanceDetailsDAO = articleFinanceDetailsDAO;
        this.articleMetadataDAO = articleMetadataDAO;
    }

    @Path("/add")
    @GET
    public Integer insertUser() {
        //LOGGER.info("getting user info");
        return articleDAO.insert("testArticle", "testArticle@gmail.com", "0011100111","00011110001110011", "22222222");
    }

    @Path("/get")
    @GET
    public Article getUser() {
        Article article = articleDAO.findByName("%jay%");
        return article;
    }
}
