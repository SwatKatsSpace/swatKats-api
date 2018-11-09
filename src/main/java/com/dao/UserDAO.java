package com.dao;

import com.mapper.UserMapper;
import com.model.ImmutableUser;
import com.model.User;
import org.jdbi.v3.sqlobject.config.RegisterColumnMapper;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;


@RegisterRowMapper(UserMapper.class)
public interface UserDAO {

    @SqlUpdate("insert into user (id, name, email, phone, aadharId) values (:id, :name, :email, :phone, :aadharId)")
    Integer insert(@Bind("id") String id, @Bind("name") String name, @Bind("phone") String phone, @Bind("aadharId") String aadharId);

    @SqlQuery("select ImmutableUser from user where name like %:name%")
    User findByName(@Bind("name") String name);
}
