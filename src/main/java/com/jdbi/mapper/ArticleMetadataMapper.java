package com.jdbi.mapper;

import com.model.immutables.ImmutableArticleMetadata;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleMetadataMapper implements RowMapper<ImmutableArticleMetadata> {
    @Override
    public ImmutableArticleMetadata map(ResultSet rs, StatementContext ctx) throws SQLException {
        return ImmutableArticleMetadata.builder()
                .category(rs.getString("category"))
                .description(rs.getString("descripition"))
                .tags(rs.getString("tags"))
                .build();
    }
}
