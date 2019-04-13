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

    @SqlQuery("select uuid, name, email, phone, password, aadhar_id as \"aadharId\", pan_id as \"panId\" from users")
    List<User> getUserList();

    @SqlQuery("select uuid, name, email, phone, password, aadhar_id as \"aadharId\", pan_id as \"panId\" from users where uuid = :uuid")
    User getUserByUuid(@Bind("uuid") UUID uuid);

    @SqlQuery("select uuid, name, email, phone, password, aadhar_id as \"aadharId\", pan_id as \"panId\" from users where email = :email")
    User getUserByEmail(@Bind("email") String email);

    @SqlQuery("select uuid, name, email, phone, password, aadhar_id as \"aadharId\", pan_id as \"panId\" from users where aadhar_id = :aadharId")
    User getUserByAadharId(@Bind("aadharId") String aadharId);

    @SqlQuery("SELECT uuid, name, email, phone, password, aadhar_id, pan_id " +
            "FROM users " +
            "WHERE (email = :id OR phone = :id) AND password = :password")
    User getUserByEmailOrPhone(@Bind("id") String id, @Bind("password") String password);

    @SqlUpdate("INSERT INTO users (name, email, phone, password, aadhar_id, pan_id) VALUES (:name, :email, :phone, :password, :aadharId, :panId) ")
    void createUser(@Bind("name") String name,
                    @Bind("email") String email,
                    @Bind("phone") String phone,
                    @Bind("password") String password,
                    @Bind("aadharId") String aadharId,
                    @Bind("panId") String panId);
}
