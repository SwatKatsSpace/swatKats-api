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
                               .firstName(rs.getString("firstName"))
                               .lastName(rs.getString("lastName"))
                               .email(rs.getString("email"))
                               .phone(rs.getString("phone"))
                               .aadharId(rs.getString("aadharId"))
                               .panId(rs.getString("panId"))
                               .image(rs.getString("image"))
                               .relation(rs.getString("relation"))
                               .description(rs.getString("description"))
                               .likes(rs.getString("likes"))
                               .build();
    }
}
