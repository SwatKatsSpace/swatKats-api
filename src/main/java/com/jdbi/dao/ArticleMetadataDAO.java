package com.jdbi.dao;

import com.jdbi.mapper.ArticleMetadataMapper;
import com.model.ArticleMetadata;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@RegisterRowMapper(ArticleMetadataMapper.class)
public interface ArticleMetadataDAO {
    @SqlQuery("select * from article_metadata where uuid = :uuid")
    ArticleMetadata findId(@Bind("uuid") String uuid);
}
