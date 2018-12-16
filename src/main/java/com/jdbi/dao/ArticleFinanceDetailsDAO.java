package com.jdbi.dao;

import com.jdbi.mapper.ArticleFinanceDetailsMapper;
import com.model.ArticleFinanceDetails;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@RegisterRowMapper(ArticleFinanceDetailsMapper.class)
public interface ArticleFinanceDetailsDAO {
    @SqlQuery("select * from article_finance_details where uuid = :uuid")
    ArticleFinanceDetails findId(@Bind("uuid") String uuid);
}
