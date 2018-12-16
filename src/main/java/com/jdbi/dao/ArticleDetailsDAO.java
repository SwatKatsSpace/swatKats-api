package com.jdbi.dao;

import com.jdbi.mapper.ArticleDetailsMapper;
import com.model.ArticleDetails;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterRowMapper(ArticleDetailsMapper.class)
public interface ArticleDetailsDAO {
    @SqlQuery("select * from article_details where uuid = :uuid")
    ArticleDetails findId(@Bind("uuid") String uuid);

    @SqlQuery("select * from article_details")
    List<ArticleDetails> getAll();
}
