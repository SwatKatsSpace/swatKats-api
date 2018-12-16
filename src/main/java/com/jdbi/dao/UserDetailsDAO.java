package com.jdbi.dao;

import com.jdbi.mapper.UserDetailsMapper;
import com.model.UserDetails;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterRowMapper(UserDetailsMapper.class)
public interface UserDetailsDAO {
    @SqlQuery("select * from user_details where uuid = :uuid")
    UserDetails findId(@Bind("uuid") String uuid);

    @SqlQuery("select * from user_details")
    List<UserDetails> getAll();

}
