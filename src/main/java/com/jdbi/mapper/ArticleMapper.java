package com.jdbi.mapper;

import com.model.Article;
import com.model.immutables.ImmutableArticle;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleMapper implements RowMapper<Article> {

    @Override
    public Article map(ResultSet rs, StatementContext ctx) throws SQLException {
        return ImmutableArticle.builder()
                .uuid(rs.getString("uuid"))
                .aadharId(rs.getString("aadhar_id"))
                .email(rs.getString("email"))
                .name(rs.getString("name"))
                .panId(rs.getString("pan_id"))
                .phone(rs.getString("phone"))
                .build();
    }
}
