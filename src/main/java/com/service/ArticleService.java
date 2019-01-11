package com.service;

import com.jdbi.dao.ArticleDAO;
import com.model.Article;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;
import java.util.UUID;

@Service
@Singleton
public class ArticleService {

    @Inject
    private ArticleDAO articleDAO;

    public List<Article> getArticleList() {

        List<Article> articleList = articleDAO.getArticleList();
        return articleList;
    }

    public Article getArticleByUuid(UUID articleUuid) {

        Article article = articleDAO.getArticleByUuid(articleUuid);
        return article;
    }

    public Integer addNewArticle(Article article) {

        return articleDAO.addNewArticle(
                article.firstName(),
                article.lastName(),
                article.email(),
                article.phone().get(),
                article.aadharId(),
                article.panId(),
                article.image(),
                article.relation(),
                article.description(),
                article.likes());
    }
}
