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

    @SqlUpdate("CREATE TABLE Users (Name text, Email text, Phone text, AadharId text, Id text)")
    Integer create();

    @SqlUpdate("insert into Users (Id, Name, Email, Phone, AadharId) values (:id, :name, :email, :phone, :aadharId)")
    Integer insert(@Bind("id") String id, @Bind("name") String name, @Bind("email") String email, @Bind("phone") String phone, @Bind("aadharId") String aadharId);

    @SqlQuery("select * from Users where Name like :name")
    ImmutableUser findByName(@Bind("name") String name);
}
