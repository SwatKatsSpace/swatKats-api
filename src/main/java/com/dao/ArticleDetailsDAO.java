package com.dao;

import com.mapper.ArticleDetailsMapper;
import com.model.immutables.ImmutableArticleDetails;
import com.model.immutables.ImmutableArticleMetadata;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@RegisterRowMapper(ArticleDetailsMapper.class)
public interface ArticleDetailsDAO {
    @SqlQuery("select * from article_details where uuid = :uuid")
    ImmutableArticleDetails findId(@Bind("uuid") String uuid);
}
