package com.dao;

import com.mapper.ArticleMetadataMapper;
import com.model.ArticleMetadata;
import com.model.immutables.ImmutableArticleMetadata;
import com.model.immutables.ImmutableUser;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@RegisterRowMapper(ArticleMetadataMapper.class)
public interface ArticleMetadataDAO {
    @SqlQuery("select * from article_metadata where uuid = :uuid")
    ImmutableArticleMetadata findId(@Bind("uuid") String uuid);
}
