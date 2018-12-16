package com.jdbi.mapper;

import com.model.immutables.ImmutableArticleDetails;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleDetailsMapper implements RowMapper<ImmutableArticleDetails> {
    @Override
    public ImmutableArticleDetails map(ResultSet rs, StatementContext ctx) throws SQLException {
        return ImmutableArticleDetails.builder()
                .address(rs.getString("address"))
                .info(rs.getString("info"))
                .lat(rs.getString("lat"))
                .lng(rs.getString("lng"))
                .photo(rs.getString("photo"))
                .build();
    }
}
