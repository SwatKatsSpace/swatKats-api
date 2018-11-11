package com.dao;

import com.mapper.UserDetailsMapper;
import com.model.immutables.ImmutableUser;
import com.model.immutables.ImmutableUserDetails;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

@RegisterRowMapper(UserDetailsMapper.class)
public interface UserDetailsDAO {
    @SqlQuery("select * from user_details where uuid = :uuid")
    ImmutableUserDetails findId(@Bind("uuid") String uuid);

    @SqlQuery("select * from user_details")
    ImmutableUserDetails getAll();

    @SqlUpdate("");
}
