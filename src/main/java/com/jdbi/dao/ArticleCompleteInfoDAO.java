package com.jdbi.dao;

import com.jdbi.mapper.ArticleCompleteInfoMapper;
import com.model.ArticleCompleteInfo;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterRowMapper(ArticleCompleteInfoMapper.class)
public interface ArticleCompleteInfoDAO {
    @SqlQuery("select * from article as a as u left join article_details as ad on a.uuid = ad.uuid left join artical_finance_details as afd on a.uuid = afd.uuid")
    List<ArticleCompleteInfo> getAllArticleCompleteInfo();
}
