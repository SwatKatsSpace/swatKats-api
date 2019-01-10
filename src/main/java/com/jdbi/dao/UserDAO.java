package com.jdbi.dao;

import com.jdbi.mapper.UserMapper;
import com.model.User;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import ru.vyarus.guicey.jdbi3.installer.repository.JdbiRepository;
import ru.vyarus.guicey.jdbi3.tx.InTransaction;

import java.util.List;
import java.util.UUID;

@JdbiRepository
@InTransaction
@RegisterRowMapper(UserMapper.class)
public interface UserDAO {
//
//    @SqlUpdate("insert into users (name, email, phone, password, aadhar_id, pan_id) values (:name, :email, :phone, :password, :aadharId, :panId)")
//    Integer insert(@Bind("name") String name, @Bind("email") String email, @Bind("phone") String phone, @Bind("password") String password, @Bind("aadharId") String aadharId, @Bind("panId") String panId);
//
//    @SqlQuery("select * from users where email = :email or phone = :phone")
//    ImmutableUser findByEmailAndPhone(@Bind("email") String email, @Bind("phone") String phone);
//
//    @SqlQuery("select * from users where email = :email or phone = :phone or aadhar_id = :aadharId")
//    List<ImmutableUser> findByEmailAndPhoneAndAadhar(@Bind("email") String email, @Bind("phone") String phone, @Bind("aadharId") String aadharId);
//
//    @SqlQuery("select * from users where name like :name")
//    ImmutableUser findByName(@Bind("name") String name);
//
//    @SqlQuery("select * from users where name = :email")
//    ImmutableUser findByEmail(@Bind("email") String email);
//
//    @SqlQuery("select * from users where aadhar_id = :aadharId")
//    ImmutableUser findByAadharId(@Bind("aadharId") String aadharId);
//
//    @SqlQuery("select * from users where pan_id = :panId")
//    ImmutableUser findByPanId(@Bind("panId") String panId);
//
//    @SqlQuery("select * from users where uuid = :uuid")
//    ImmutableUser findId(@Bind("uuid") String uuid);
//
//    @SqlQuery("select * from users where phone = :phone")
//    ImmutableUser findByPhone(@Bind("phone") String phone);

    @SqlQuery("select uuid, name, email, phone, password, aadhar_id as \"aadharId\", pan_id as \"panId\" from users")
    List<User> getUserList();

    @SqlQuery("select uuid, name, email, phone, password, aadhar_id as \"aadharId\", pan_id as \"panId\" from users where uuid = :uuid")
    User getUserByUuid(@Bind("uuid") UUID uuid);

    @SqlQuery("select uuid, name, email, phone, password, aadhar_id as \"aadharId\", pan_id as \"panId\" from users where email = :email")
    User getUserByEmail(@Bind("email") String email);

    @SqlQuery("select uuid, name, email, phone, password, aadhar_id as \"aadharId\", pan_id as \"panId\" from users where aadhar_id = :aadharId")
    User getUserByAadharId(@Bind("aadharId") String aadharId);

    @SqlUpdate("INSERT INTO users (name, email, phone, password, aadhar_id, pan_id) VALUES (:name, :email, :phone, :password, :aadharId, :panId) ")
    void createUser(@Bind("name") String name,
                    @Bind("email") String email,
                    @Bind("phone") String phone,
                    @Bind("password") String password,
                    @Bind("aadharId") String aadharId,
                    @Bind("panId") String panId);
}
