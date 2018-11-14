package com.dao;

import com.mapper.UserMapper;
import com.model.User;
import com.model.immutables.ImmutableUser;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;


@RegisterRowMapper(UserMapper.class)
public interface UserDAO {

    /*@SqlUpdate("CREATE TABLE Users (Name text, Email text, Phone text, AadharId text, Id text)")
    Integer create();*/

    @SqlUpdate("insert into users (name, email, phone, password, aadhar_id, pan_id) values (:name, :email, :phone, :password, :aadharId, :panId)")
    Integer insert(@Bind("name") String name, @Bind("email") String email, @Bind("phone") String phone, @Bind("password") String password, @Bind("aadharId") String aadharId, @Bind("panId") String panId);

    @SqlQuery("select * from users where name like :name")
    User findByName(@Bind("name") String name);

    @SqlQuery("select * from users where name = :email")
    User findByEmail(@Bind("email") String email);

    @SqlQuery("select * from users where aadhar_id = :aadharId")
    User findByAadharId(@Bind("aadharId") String aadharId);

    @SqlQuery("select * from users where pan_id = :panId")
    User findByPanId(@Bind("panId") String panId);

    @SqlQuery("select * from users where uuid = :uuid")
    User findId(@Bind("uuid") String uuid);

    @SqlQuery("select * from users where phone = :phone")
    User findByPhone(@Bind("phone") String phone);

    @SqlQuery("select * from users")
    List<User> getAll();

}
