package com.jdbi.dao;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import ru.vyarus.guicey.jdbi3.installer.repository.JdbiRepository;
import ru.vyarus.guicey.jdbi3.tx.InTransaction;

import java.util.UUID;

@JdbiRepository
@InTransaction
public interface LoginDAO {
    @SqlUpdate("INSERT INTO logged_in_user (uuid, jw_token) VALUES (:uuid, :jwToken) ")
    void insertUserToken(@Bind("uuid") UUID uuid,
                         @Bind("jwToken") String jwToken);

    @SqlQuery("SELECT jw_token FROM logged_in_user WHERE uuid = :uuid")
    String getUserToken(@Bind("uuid") UUID uuid);
}
