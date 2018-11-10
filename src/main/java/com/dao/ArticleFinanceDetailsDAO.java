package com.dao;

import com.mapper.ArticleFinanceDetailsMapper;
import com.model.immutables.ImmutableArticleFinanceDetails;
import com.model.immutables.ImmutableArticleMetadata;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@RegisterRowMapper(ArticleFinanceDetailsMapper.class)
public interface ArticleFinanceDetailsDAO {
    @SqlQuery("select * from article_finance_details where uuid = :uuid")
    ImmutableArticleFinanceDetails findId(@Bind("uuid") String uuid);
}
