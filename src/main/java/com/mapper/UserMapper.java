package com.mapper;

import com.model.immutables.ImmutableUser;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<ImmutableUser> {

    @Override
    public ImmutableUser map(ResultSet rs, StatementContext ctx) throws SQLException {
        return  ImmutableUser.builder()
                .name(rs.getString("name"))
                .aadharId(rs.getString("aadhar_id"))
                .email(rs.getString("email"))
                .phone(rs.getString("phone"))
                .panId(rs.getString("pan_id"))
                .build();
    }
}
