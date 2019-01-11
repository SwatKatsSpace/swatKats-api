package com.service;

import com.jdbi.dao.ArticleDAO;
import com.model.Article;

import org.jvnet.hk2.annotations.Service;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Singleton;

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

    public void createArticle(Article article) {

        articleDAO.createArticle(
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
