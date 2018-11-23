package com.mapper;

import com.model.immutables.ImmutableUserCompleInfo;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserCompleteInfoMapper implements RowMapper<ImmutableUserCompleInfo> {
    @Override
    public ImmutableUserCompleInfo map(ResultSet rs, StatementContext ctx) throws SQLException {
        System.out.println(rs.toString());
        return null;
    }
}
