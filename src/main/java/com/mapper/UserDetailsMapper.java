package com.mapper;

import com.model.immutables.ImmutableUserDetails;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDetailsMapper implements RowMapper<ImmutableUserDetails> {
    @Override
    public ImmutableUserDetails map(ResultSet rs, StatementContext ctx) throws SQLException {
        return ImmutableUserDetails.builder()
                .address(rs.getString("address"))
                .info(rs.getString("info"))
                .build();
    }
}
