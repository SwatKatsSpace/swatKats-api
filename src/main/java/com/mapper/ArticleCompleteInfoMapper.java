package com.mapper;

import com.model.immutables.ImmutableArticleCompleteInfo;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleCompleteInfoMapper implements RowMapper<ImmutableArticleCompleteInfo> {
    @Override
    public ImmutableArticleCompleteInfo map(ResultSet rs, StatementContext ctx) throws SQLException {
        System.out.println("Article Complete Info" + rs);
        return null;
    }
}
