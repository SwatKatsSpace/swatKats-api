package com.resources;

import com.dao.*;
import com.model.Article;
import com.model.User;
import com.model.immutables.ImmutableArticle;
import com.model.immutables.ImmutableUser;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/swatkats/article")
@Produces(MediaType.APPLICATION_JSON)
public class ArticleResource {
    public static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    private final ArticleDAO articleDAO;
    private final ArticleDetailsDAO articleDetailsDAO;
    private final ArticleFinanceDetailsDAO articleFinanceDetailsDAO;
    private final ArticleMetadataDAO articleMetadataDAO;
    private final Jdbi jdbi;

    public ArticleResource(Jdbi jdbi, ArticleDAO articleDAO, ArticleDetailsDAO articleDetailsDAO, ArticleFinanceDetailsDAO articleFinanceDetailsDAO, ArticleMetadataDAO articleMetadataDAO) {
        this.jdbi = jdbi;
        this.articleDAO = articleDAO;
        this.articleDetailsDAO = articleDetailsDAO;
        this.articleFinanceDetailsDAO = articleFinanceDetailsDAO;
        this.articleMetadataDAO = articleMetadataDAO;
    }

    @Path("/add")
    @POST
    public Integer insertUser(User user) {
        return articleDAO.insert(user.name(), user.email(), user.phone().get(), user.aadharId(), user.panId());
    }

    public Integer insertUserDetails(String uuid, String phone) {
        //Optional uuidOptional = Optional.of()
        articleDAO.findByUuidAndPhone(uuid, phone);
        return null;
    }


    @Path("/get")
    @GET
    public List<Article> getUser() {
        List<Article> articles = articleDAO.getAll();
        return articles;
    }
}
