package com.dao;

import com.mapper.UserMapper;
import com.model.immutables.ImmutableUser;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;


@RegisterRowMapper(UserMapper.class)
public interface UserDAO {

    /*@SqlUpdate("CREATE TABLE Users (Name text, Email text, Phone text, AadharId text, Id text)")
    Integer create();*/

    @SqlUpdate("insert into users (name, email, phone, password, aadhar_id, pan_id) values (:name, :email, :phone, :password, :aadharId, :panId)")
    Integer insert(@Bind("name") String name, @Bind("email") String email, @Bind("phone") String phone, @Bind("password") String password, @Bind("aadharId") String aadharId, @Bind("panId") String panId);

    @SqlQuery("select * from users where name like :name")
    ImmutableUser findByName(@Bind("name") String name);

    @SqlQuery("select * from users where name = :email")
    ImmutableUser findByEmail(@Bind("email") String email);

    @SqlQuery("select * from users where aadhar_id = :aadharId")
    ImmutableUser findByAadharId(@Bind("aadharId") String aadharId);

    @SqlQuery("select * from users where pan_id = :panId")
    ImmutableUser findByPanId(@Bind("panId") String panId);

    @SqlQuery("select * from users where phone = :phone")
    ImmutableUser findByPhone(@Bind("phone") String phone);

    @SqlQuery("select * from users where uuid = :uuid")
    ImmutableUser findId(@Bind("uuid") String uuid);

}
