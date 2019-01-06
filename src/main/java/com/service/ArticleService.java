package com.service;

import com.jdbi.dao.ArticleDAO;
import com.model.Article;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Service
@Singleton
public class ArticleService {

    @Inject
    private ArticleDAO articleDAO;

    public List<Article> getArticleList() {

        List<Article> articleList = articleDAO.getArticleList();
        return articleList;
    }
}
